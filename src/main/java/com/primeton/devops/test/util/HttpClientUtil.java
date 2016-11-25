/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Nov 17, 2016 10:21:31 AM
 *******************************************************************************/

package com.primeton.devops.test.util;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * HttpClientUtil.
 * 
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
public class HttpClientUtil implements Constants {

	private static Logger logger = Logger
			.getLogger(HttpClientUtil.class);

	private HttpClientUtil() {
	}
	
	public static void main(String[] args) {
		System.out.println(getClient());
	}
	
	public static class HttpClient {
		
		private CloseableHttpClient client;
		private String session;
		
		/**
		 * @param client
		 * @param session
		 */
		public HttpClient(CloseableHttpClient client, String session) {
			super();
			this.client = client;
			this.session = session;
		}

		/**
		 * @return Returns the client.
		 */
		public CloseableHttpClient getClient() {
			return client;
		}

		/**
		 * @return Returns the session.
		 */
		public String getSession() {
			return session;
		}
		
	}
	
	private static HttpClient getClient() {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost request = new HttpPost(getFullURL("/coframe/auth/login/org.gocom.components.coframe.auth.login.login.flow")); //$NON-NLS-1$
		List<NameValuePair> parameters = new ArrayList<>();
		parameters.add(new BasicNameValuePair("userId", DEVOPS_USER)); //$NON-NLS-1$
		parameters.add(new BasicNameValuePair("password", DEVOPS_PASS)); //$NON-NLS-1$
		parameters.add(new BasicNameValuePair("original_url", DEVOPS_ORIGINAL_URL));
		UrlEncodedFormEntity entity = null;
		try {
			entity = new UrlEncodedFormEntity(parameters);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		request.setEntity(entity);
		String session = null;
		try {
			HttpResponse response = client.execute(request);
			Header header = response.getFirstHeader("Set-Cookie");
			for (HeaderElement e : header.getElements()) {
				if (e.getName().startsWith("JSESSIONID")) {
					session = e.getValue();
				}
			}
			System.out.println(response.getStatusLine().getStatusCode());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new HttpClient(client, session);
	}
	
	/**
	 * 
	 * @param restURL
	 * @return
	 */
	public static String getFullURL(String restURL) {
		if (null == restURL) {
			return null;
		}
		return DEVOPS_URL + restURL;
	}

	/**
	 * 
	 * @param client
	 * @param method
	 *            get|delete
	 * @param url
	 * @param headers
	 * @return
	 */
	public static HttpResult sendRequest(String method, String url,
			Map<String, String> headers) throws Exception {
		HttpClient httpClient = getClient();
		CloseableHttpClient client = httpClient.getClient();
		if (null == client || StringUtils.isEmpty(url)) {
			return null;
		}
		if ("POST".equalsIgnoreCase(method)
				|| "PUT".equalsIgnoreCase(method)) {
			return sendRequest(method, url, headers, null);
		}
		HttpRequestBase request = "DELETE".equalsIgnoreCase(method) ? new HttpDelete(
				url) : new HttpGet(url);
		if (null != headers && !headers.isEmpty()) {
			for (String name : headers.keySet()) {
				request.addHeader(name, headers.get(name));
			}
		}
		CloseableHttpResponse response = null;
		try {
			logger.debug(String.format("Send %s request to %s.", method, url));
			response = client.execute(request);
			int status = response.getStatusLine().getStatusCode();
			String content = getContent(response);
			return new HttpResult(status, content);
		} catch (Throwable e) {
			throw new Exception(e);
		} finally {
			IOUtils.closeQuietly(response);
		}
	}

	/**
	 * 
	 * @param client
	 * @param method
	 *            post|delete|put
	 * @param url
	 * @param headers
	 * @param entity
	 *            HttpEntity or String or JavaBean or null
	 * @return
	 */
	public static HttpResult sendRequest(String method, String url,
			Map<String, String> headers, Object entity) throws Exception {
		HttpClient httpClient = getClient();
		CloseableHttpClient client = httpClient.getClient();
		if (null == client || StringUtils.isEmpty(url)) {
			return null;
		}
		if ("GET".equalsIgnoreCase(method) //$NON-NLS-1$
				|| "DELETE".equalsIgnoreCase(method)) { //$NON-NLS-1$
			if (null == entity) {
				return sendRequest(method, url, headers);
			} else {
				throw new RuntimeException("Method error, can not send"
						+ method + " request with entity data " + entity + ".");
			}
		}
		HttpEntityEnclosingRequestBase request = "PUT".equalsIgnoreCase(method) ? new HttpPut(url)
				: new HttpPost(url);
		if (null != headers && !headers.isEmpty()) {
			for (String name : headers.keySet()) {
				request.addHeader(name, headers.get(name));
			}
		}
		
		if (null != entity) {
			if (entity instanceof HttpEntity) {
				request.setEntity((HttpEntity) entity);
			} else if (entity instanceof String) {
				request.setEntity(new StringEntity((String) entity,
						ContentType.APPLICATION_JSON)); // ContentType.TEXT_PLAIN
			} else {
				request.setEntity(new StringEntity(new ObjectMapper()
						.writeValueAsString(entity),
						ContentType.APPLICATION_JSON));
			}
		}
		CloseableHttpResponse response = null;
		try {
			response = client.execute(request);
			int status = response.getStatusLine().getStatusCode();
			String content = getContent(response);
			return new HttpResult(status, content);
		} catch (Throwable e) {
			throw new Exception(e);
		} finally {
			IOUtils.closeQuietly(response);
		}
	}

	/**
	 * 
	 * @param response
	 * @return
	 */
	public static String getContent(CloseableHttpResponse response)
			throws Exception {
		if (null == response) {
			return null;
		}
		HttpEntity entity = response.getEntity();
		return null == entity ? null : EntityUtils.toString(entity);
		
		/*
		if (null == entity) {
			return null;
		}
		InputStream inputStream = null;
		try {
			inputStream = entity.getContent();
			return IOUtils.toString(inputStream, "utf-8"); //$NON-NLS-1$
		} catch (Throwable e) {
			throw new Exception(e);
		} finally {
			IOUtils.closeQuietly(inputStream);
		}
		*/
	}

	/**
	 * If error, return error message. <br>
	 * 
	 * @param response
	 * @return
	 */
	public static String getContentIgnoreError(CloseableHttpResponse response) {
		try {
			return getContent(response);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	/**
	 * 
	 * HttpResult.
	 *
	 * @author ZhongWen Li (mailto:lizw@primeton.com)
	 */
	public static class HttpResult implements Serializable {

		/**
		 * <code>serialVersionUID</code>
		 */
		private static final long serialVersionUID = 7364653914616309925L;
		
		private int status;
		private String content;
		
		/**
		 * 
		 */
		public HttpResult() {
			super();
		}

		/**
		 * @param status
		 * @param content
		 */
		public HttpResult(int status, String content) {
			super();
			this.status = status;
			this.content = content;
		}

		/**
		 * @return Returns the status.
		 */
		public int getStatus() {
			return status;
		}

		/**
		 * @param status The status to set.
		 */
		public void setStatus(int status) {
			this.status = status;
		}

		/**
		 * @return Returns the content.
		 */
		public String getContent() {
			return content;
		}

		/**
		 * @param content The content to set.
		 */
		public void setContent(String content) {
			this.content = content;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "HttpResult [status=" + status + ", content=" + content
					+ "]";
		}
		
	}

}

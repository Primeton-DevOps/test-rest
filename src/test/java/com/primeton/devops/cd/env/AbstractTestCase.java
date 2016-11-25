/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Nov 16, 2016 8:21:53 PM
 *******************************************************************************/

package com.primeton.devops.cd.env;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.primeton.devops.test.util.HttpClientUtil;
import com.primeton.devops.test.util.HttpClientUtil.HttpResult;

/**
 * AbstractTestCase.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
public abstract class AbstractTestCase {
	
	protected static final String PATH_PREFIX = "classpath:"; //$NON-NLS-1$
	protected static final String REST_PREFIX = "/rest/services"; //$NON-NLS-1$
	
	protected final String uid = new SimpleDateFormat("yyyyMMddHHmmSS").format(new Date());

	@Before
	public void init() {
	}
	
	@Test
	public abstract void test() throws Exception;

	@After
	public void clean() {
	}
	
	/**
	 * 
	 * @return
	 */
	protected Map<String, String> getDefaultHeaders() {
		Map<String, String> headers = new HashMap<>();
		headers.put("Accept", "application/json"); //$NON-NLS-1$ //$NON-NLS-2$
		headers.put("Content-Type", "application/json"); //$NON-NLS-1$ //$NON-NLS-2$
		return headers;
	}
	
	/**
	 * 
	 * @param restUrl
	 * @return
	 * @throws Exception
	 */
	protected HttpResult getRequest(String restUrl) throws Exception {
		return getRequest(restUrl, getDefaultHeaders());
	}
	
	/**
	 * 
	 * @param restUrl
	 * @param headers
	 * @return
	 * @throws Exception
	 */
	protected HttpResult getRequest(String restUrl, Map<String, String> headers) throws Exception {
		return HttpClientUtil.sendRequest("GET", HttpClientUtil.getFullURL(restUrl), headers); //$NON-NLS-1$
	}
	
	/**
	 * 
	 * @param restUrl
	 * @return
	 * @throws Exception
	 */
	protected HttpResult deleteRequest(String restUrl) throws Exception {
		 return deleteRequest(restUrl, getDefaultHeaders());
	}
	
	/**
	 * @param restUrl
	 * @param defaultHeaders
	 * @throws Exception 
	 */
	protected HttpResult deleteRequest(String restUrl, Map<String, String> headers) throws Exception {
		return HttpClientUtil.sendRequest("DELETE", HttpClientUtil.getFullURL(restUrl), headers); //$NON-NLS-1$
	}
	
	/**
	 * <em>About parameter 'entity' :</em> <br>
	 * 
	 * 1) JSON string; <br>
	 * 2) Java Bean (Can serialize to JSON); <br>
	 * 3) File path string, or File object, or classpath file
	 *    <p>"/tmp/user.json"</p>
	 *    <p>new File("/tmp/user.json")</p>
	 *    <p>"classpath:/test/user.json"</p>s
	 * 
	 * @param restUrl
	 * @param headers
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	protected HttpResult putRequest(String restUrl, Map<String, String> headers, Object entity) throws Exception {
		if (null != entity && entity instanceof String && ((String)entity).startsWith(PATH_PREFIX)) {
			entity = getResourceAsString((String)entity);
		}
		return HttpClientUtil.sendRequest("PUT", HttpClientUtil.getFullURL(restUrl), headers, entity); //$NON-NLS-1$
	}
	
	/**
	 * 
	 * @param restUrl
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	protected HttpResult putRequest(String restUrl, Object entity) throws Exception {
		return putRequest(restUrl, getDefaultHeaders(), entity);
	}
	
	/**
	 * 
	 * @param restUrl
	 * @param headers
	 * @return
	 * @throws Exception
	 */
	protected HttpResult putRequest(String restUrl, Map<String, String> headers) throws Exception {
		return putRequest(restUrl, headers, null);
	}
	
	/**
	 * 
	 * @param restUrl
	 * @return
	 * @throws Exception
	 */
	protected HttpResult putRequest(String restUrl) throws Exception {
		return putRequest(restUrl, getDefaultHeaders(), null);
	}
	
	/**
	 * 
	 * @param restUrl
	 * @param headers
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	protected HttpResult postRequest(String restUrl, Map<String, String> headers, Object entity) throws Exception {
		return HttpClientUtil.sendRequest("POST", HttpClientUtil.getFullURL(restUrl), headers, entity); //$NON-NLS-1$
	}
	
	/**
	 * <em>About parameter 'entity' :</em> <br>
	 * 
	 * 1) JSON string; <br>
	 * 2) Java Bean (Can serialize to JSON); <br>
	 * 3) File path string, or File object, or classpath file
	 *    <p>"/tmp/user.json"</p>
	 *    <p>new File("/tmp/user.json")</p>
	 *    <p>"classpath:/test/user.json"</p>
	 *    
	 * 
	 * @param restUrl
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	protected HttpResult postRequest(String restUrl, Object entity) throws Exception {
		if (null != entity && entity instanceof String && ((String)entity).startsWith(PATH_PREFIX)) {
			entity = getResourceAsString((String)entity);
		}
		return postRequest(restUrl, getDefaultHeaders(), entity);
	}
	
	/**
	 * 
	 * @param restUrl
	 * @param headers
	 * @return
	 * @throws Exception
	 */
	protected HttpResult postRequest(String restUrl, Map<String, String> headers) throws Exception {
		return postRequest(restUrl, headers, null);
	}
	
	/**
	 * 
	 * @param restUrl
	 * @return
	 * @throws Exception
	 */
	protected HttpResult postRequest(String restUrl) throws Exception {
		return postRequest(restUrl, getDefaultHeaders(), null);
	}

	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	protected InputStream getResourceAsStream(String filePath) throws FileNotFoundException {
		if (StringUtils.isBlank(filePath)) {
			return null;
		}
		if (filePath.startsWith(PATH_PREFIX) && filePath.length() > PATH_PREFIX.length()) {
			filePath = filePath.substring(PATH_PREFIX.length());
			return AbstractTestCase.class.getResourceAsStream(filePath);
		} else {
			return new FileInputStream(filePath);
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	protected String getResourceAsString(String filePath) throws FileNotFoundException {
		InputStream in = getResourceAsStream(filePath);
		if (null == in) {
			return null;
		}
		try {
			return IOUtils.toString(in, Charset.forName("utf-8")); //$NON-NLS-1$
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(in);
		}
		return null;
	}

}

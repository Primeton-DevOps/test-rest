/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Dec 6, 2016 9:35:34 AM
 *******************************************************************************/

package com.primeton.devops.test.cd.cs;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.primeton.devops.test.framework.AbstractTestCase;
import com.primeton.devops.test.util.JsonUtil;
import com.primeton.devops.test.util.HttpClientUtil.HttpResult;

/**
 * CloudServiceTestCase.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
public class CloudServiceTestCase extends AbstractTestCase {

	/* (non-Javadoc)
	 * @see com.primeton.devops.test.framework.AbstractTestCase#test()
	 */
	@Override
	public void test() throws Exception {
		//
		// without page [POST]
		//
		HttpResult result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query4.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		//
		// with page [PUT]
		//
		
		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/query4.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void cascade() throws Exception {
		//
		// without page [POST]
		//
		HttpResult result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade4.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		//
		// with page [PUT]
		//
		
		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = putRequest(REST_PREFIX + "/cd/cservices/query", 
				"classpath:/cd/cs/service/queryCascade4.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
	}
	
	@Test
	public void get() throws Exception {
		HttpResult result = getRequest(REST_PREFIX + "/cd/cservices/1");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = getRequest(REST_PREFIX + "/cd/cservices/2");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = getRequest(REST_PREFIX + "/cd/cservices/1?cascade=false");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = getRequest(REST_PREFIX + "/cd/cservices/2?cascade=true&sss=xxx");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
	}
	
	@Test
	public void delete() throws Exception {
		HttpResult result = deleteRequest(REST_PREFIX + "/cd/cservices/11");
		Assert.assertTrue(200 == result.getStatus() || 204 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = deleteRequest(REST_PREFIX + "/cd/cservices/111");
		System.out.println(result.getStatus());
		Assert.assertTrue(200 == result.getStatus() || 204 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void submit() throws Exception {
		// 测试提交云服务申请单以及明细
		HttpResult result = postRequest(REST_PREFIX + "/cd/cservices/order", 
				"classpath:/cd/cs/service/order.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		// 更新订单
		Map<String, Object> data = JsonUtil.toObject(result.getContent(), Map.class);
		data.put("projectId", "10002");
		data.put("description", "updated");
		data.put("notifyMode", "sms");
		Map<String, Object> entity = new HashMap<>();
		entity.put("data", data);
		
		result = putRequest(REST_PREFIX + "/cd/cservices/order", entity);
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
	}
	
}

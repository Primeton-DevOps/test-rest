/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Dec 6, 2016 9:35:34 AM
 *******************************************************************************/

package com.primeton.devops.test.cd.cs;

import org.junit.Assert;

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
		// without page
		//
		HttpResult result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query4.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query.json");
		
		//
		// with page
		//
		
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));

		result = postRequest(REST_PREFIX + "/cd/csservices", 
				"classpath:/cd/cs/service/query4.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
	}

}

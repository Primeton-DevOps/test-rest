/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Nov 25, 2016 2:05:02 PM
 *******************************************************************************/

package com.primeton.devops.cd.env;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import com.primeton.devops.test.util.HttpClientUtil.HttpResult;
import com.primeton.devops.test.util.JsonUtil;

/**
 * EnvironmentApiTestCase.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
public class EnvironmentApiTestCase extends AbstractTestCase {

	/* (non-Javadoc)
	 * @see com.primeton.devops.cd.env.AbstractTestCase#test()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void test() throws Exception {
		HttpResult result = getRequest(REST_PREFIX + "/cd/environments");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		result = getRequest(REST_PREFIX + "/cd/environments?cascade=false");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		result = getRequest(REST_PREFIX + "/cd/environments?cascade=true");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		result = getRequest(REST_PREFIX + "/cd/environments?tenant=sysadmin");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		result = getRequest(REST_PREFIX + "/cd/environments?tenant=chinese");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		// Query
		result = postRequest(REST_PREFIX + "/cd/environments/query", "classpath:/cd/environment/query.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		// ADD
		result = postRequest(REST_PREFIX + "/cd/environments", "classpath:/cd/environment/add.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		result = getRequest(REST_PREFIX + "/cd/environments");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		List<Map<String, Object>> envs = JsonUtil.toObject(result.getContent(), List.class);
		String aggregateId = null;
		for (Map<String, Object> e : envs) {
			Object o = e.get("aggregateName");
			if ("stage12345".equals(o)) {
				aggregateId = e.get("aggregateId").toString();
				break;
			}
		}
		
		// GET stage12345
		result = getRequest(REST_PREFIX + "/cd/environments/" + aggregateId);
		Assert.assertTrue(200 == result.getStatus());
		Assert.assertTrue(StringUtils.isNoneBlank(result.getContent()));
		System.out.println(result.getContent());
		
		// DELETE
		result = deleteRequest(REST_PREFIX + "/cd/environments/" + aggregateId);
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		
		System.out.println("Over");
	}

}

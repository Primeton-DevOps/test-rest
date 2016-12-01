/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Dec 1, 2016 5:40:46 PM
 *******************************************************************************/

package com.primeton.devops.test.cd.cs;

import org.junit.Assert;

import com.primeton.devops.test.framework.AbstractTestCase;
import com.primeton.devops.test.util.JsonUtil;
import com.primeton.devops.test.util.HttpClientUtil.HttpResult;

/**
 * CloudServiceTypeTestCase.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
public class CloudServiceTypeTestCase extends AbstractTestCase {

	/* (non-Javadoc)
	 * @see com.primeton.devops.test.framework.AbstractTestCase#test()
	 */
	@Override
	public void test() throws Exception {
		// without page
		HttpResult result = getRequest(REST_PREFIX + "/cd/cstypes");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		
		System.out.println();
		System.out.println();
		
		// with page
		result = postRequest(REST_PREFIX + "/cd/cstypes/query", "classpath:/cd/type/query.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
		
		System.out.println();
		System.out.println();
		
		// get one
		result = getRequest(REST_PREFIX + "/cd/cstypes/1");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
	}

}

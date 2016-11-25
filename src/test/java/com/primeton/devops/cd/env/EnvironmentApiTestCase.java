/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Nov 25, 2016 2:05:02 PM
 *******************************************************************************/

package com.primeton.devops.cd.env;

import org.junit.Assert;

import com.primeton.devops.test.util.HttpClientUtil.HttpResult;

/**
 * EnvironmentApiTestCase.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
public class EnvironmentApiTestCase extends AbstractTestCase {

	/* (non-Javadoc)
	 * @see com.primeton.devops.cd.env.AbstractTestCase#test()
	 */
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
	}

}

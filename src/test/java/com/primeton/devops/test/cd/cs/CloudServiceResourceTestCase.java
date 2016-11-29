/**
 * 
 */
package com.primeton.devops.test.cd.cs;

import org.junit.Assert;

import com.primeton.devops.test.framework.AbstractTestCase;
import com.primeton.devops.test.util.HttpClientUtil.HttpResult;

/**
 * @author ZhongWen (mailto:lizhongwen1989@gmail.com)
 *
 */
public class CloudServiceResourceTestCase extends AbstractTestCase {

	/* (non-Javadoc)
	 * @see com.primeton.devops.test.framework.AbstractTestCase#test()
	 */
	public void test() throws Exception {
		HttpResult result = postRequest(REST_PREFIX + "/cd/csresources/query", "classpath:/cd/cs/query.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
	}

}

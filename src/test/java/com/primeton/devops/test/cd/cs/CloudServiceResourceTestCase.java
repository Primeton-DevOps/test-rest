/**
 * 
 */
package com.primeton.devops.test.cd.cs;

import org.junit.Assert;

import com.primeton.devops.test.framework.AbstractTestCase;
import com.primeton.devops.test.util.HttpClientUtil.HttpResult;
import com.primeton.devops.test.util.JsonUtil;

/**
 * @author ZhongWen (mailto:lizhongwen1989@gmail.com)
 *
 */
public class CloudServiceResourceTestCase extends AbstractTestCase {

	/* (non-Javadoc)
	 * @see com.primeton.devops.test.framework.AbstractTestCase#test()
	 */
	public void test() throws Exception {
		
		// without page [POST]
		// 查询开发一区物理机资源
		HttpResult result = postRequest(REST_PREFIX + "/cd/csresources/query", "classpath:/cd/cs/query.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
		// 查询开发一区容器资源
		result = postRequest(REST_PREFIX + "/cd/csresources/query", "classpath:/cd/cs/query2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
		//查询开发一区虚拟机资源
		result = postRequest(REST_PREFIX + "/cd/csresources/query", "classpath:/cd/cs/query3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
		
		// with page [PUT]
		
		result = putRequest(REST_PREFIX + "/cd/csresources/query", "classpath:/cd/cs/queryWithPage.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
		
		result = putRequest(REST_PREFIX + "/cd/csresources/query", "classpath:/cd/cs/queryWithPage2.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
		
		result = putRequest(REST_PREFIX + "/cd/csresources/query", "classpath:/cd/cs/queryWithPage3.json");
		Assert.assertTrue(200 == result.getStatus());
		System.out.println(result.getContent());
		System.out.println();
		System.out.println(JsonUtil.prettyJson(result.getContent()));
		System.out.println();
	}

}

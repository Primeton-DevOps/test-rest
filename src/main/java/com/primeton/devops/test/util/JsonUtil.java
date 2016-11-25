/**
 * 
 */
package com.primeton.devops.test.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author ZhongWen (mailto:lizhongwen1989@gmail.com)
 *
 */
public class JsonUtil {
	
	private JsonUtil(){}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		if (null == obj) {
			return null;
		}
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @param json
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> toMap(String json) {
		if (StringUtils.isBlank(json)) {
			return new HashMap<>();
		}
		try {
			return new ObjectMapper().readValue(json, Map.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new HashMap<>();
	}
	
}

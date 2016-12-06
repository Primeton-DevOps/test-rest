/**
 * 
 */
package com.primeton.devops.test.util;

import java.io.IOException;
import java.util.List;
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
	 * @param prettyOutput
	 * @return
	 */
	public static String toJson(Object obj, boolean prettyOutput) {
		if (null == obj) {
			return null;
		}
		try {
			if (prettyOutput) {
				return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			} else {
				return new ObjectMapper().writeValueAsString(obj);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		return toJson(obj, true);
	}
	
	/**
	 * 
	 * @param json
	 * @return
	 */
	public static <T> T toObject(String json, Class<T> clazz) {
		if (StringUtils.isBlank(json)) {
			return null;
		}
		try {
			return new ObjectMapper().readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @param json
	 * @return
	 */
	public static String prettyJson(String json) {
		if (StringUtils.isBlank(json)) {
			return json;
		}
		return json.trim().charAt(0) == '[' // $NON-NLS-1$
				? toJson(toObject(json, List.class), true)
				: toJson(toObject(json, Map.class), true);
	}
	
}

package com.rest.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperUtils {
	static ObjectMapper MAPPER = new ObjectMapper();

	@SuppressWarnings("unchecked")
	public static <T> T readAsObjectOf(Class<T> clazz, String value)
			throws Exception {
		try {
			return MAPPER.readValue(value, clazz);
		} catch (Exception e) {
			return (T) "";
		}
	}

}

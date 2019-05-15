package com.certification.jakson;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestJakson {

	@Test
	public void serializeJson() throws JsonProcessingException {

		MyBean bean = new MyBean();
		bean.setId(1);
		bean.setName("Name");
		bean.setAddress("Test");

		String result = new ObjectMapper().writeValueAsString(bean);

		log.info(result);

		assertThat(result, containsString("Name"));
		assertThat(result, containsString("1"));
	}

	//@Test
	public void readJson() throws JsonParseException, JsonMappingException, IOException {
		String json = " {\"id\":1,\"name\":\"Name\"}";
		MyBean bean = new ObjectMapper().readValue(json, MyBean.class);
		log.info(bean.getName());
	}

	//@Test
	public void testFilter() throws JsonProcessingException {
		SimpleFilterProvider simpleFilterProvider = new SimpleFilterProvider();
		simpleFilterProvider.addFilter("studentFilter", SimpleBeanPropertyFilter.serializeAllExcept("studentAge"));
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setFilterProvider(simpleFilterProvider);
		Student student = new Student("Name", 12);
	

		String jsonData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		log.info("Method testFilter {}", jsonData);

	}
}

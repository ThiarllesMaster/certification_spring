package com.certiification.tests.rest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.first.service.GreetingService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestServices {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private GreetingService greetingService;
	
	@Test
	public void testServiceRest() throws Exception{
		when(greetingService.helloWorld()).thenReturn("Test");
		mockMvc.perform(get("/hello")).andExpect(content().string("Hello World"));
	
	}

}

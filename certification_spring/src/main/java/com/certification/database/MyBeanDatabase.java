package com.certification.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDatabase {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public MyBeanDatabase(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertEmployee() {}
	
}


package com.certification.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db/database.properties")
public class ApplicationConfig {

}

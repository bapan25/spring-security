/**
 * 
 */
package org.bapan.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Ruptam
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="org.bapan.spring.security.controller")
public class MyAppConfig {
	
	//define a bean of view resolver
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setSuffix(".jsp");
		viewResolver.setPrefix("/WEB-INF/view/");
		
		return viewResolver;
	}
	
}

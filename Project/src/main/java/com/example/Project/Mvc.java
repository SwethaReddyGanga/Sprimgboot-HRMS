package com.example.Project;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class Mvc implements WebMvcConfigurer
{
	@Override
	public void addViewControllers(ViewControllerRegistry registry)
	{
	}
	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {"classpath:/resources/","classpath:/templates/","classpath:/static/", "classpath:/public/"};
}

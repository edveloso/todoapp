package br.edu.infnet.todoapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "br.edu.infnet.todoapp.app")
public class AppConfig {

	@Bean(name="viewResolver")
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver() ;
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/WEB-INF/pages/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	
	
}

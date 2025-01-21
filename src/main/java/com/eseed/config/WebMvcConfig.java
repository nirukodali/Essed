package com.eseed.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/404").setViewName("error/404");
        registry.addViewController("/403").setViewName("error/403");
        registry.addViewController("/400").setViewName("error/400");
        registry.addViewController("/500").setViewName("error/500");
        
    }
}
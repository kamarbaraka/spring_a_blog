package com.kamar.spring_a_blog.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * the application context configuration.
 * @author kamar baraka.*/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.kamar.spring_a_blog.app"})
public class AppContextConfig implements WebMvcConfigurer {

    /**
     * set up the view resolver
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){

        /*the view resolver*/
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        /*set the prefix*/
        viewResolver.setPrefix("/WEB-INF/views/");

        /*set the suffix*/
        viewResolver.setSuffix(".jsp");

        /*return the view resolver*/
        return viewResolver;
    }

}

package com.kamar.spring_a_blog.configuration;

import com.kamar.spring_a_blog.SpringABlogApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * servlet initializer class.
 * @author kamar baraka.*/

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringABlogApplication.class);
    }
}

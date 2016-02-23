package com.springapp.mvc.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Anton on 24.01.2016.
 */
/*
* The same as the mvc-dispatcher-servlet.xml
*/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springapp.mvc")
@Import({SecurityConfig.class})
public class AppConfig extends WebMvcConfigurerAdapter {


    /**
     * Configure ViewResolvers to deliver preferred views.
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }

//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(phonesToClientPhones);
//    }
    /* Configuration resource like css*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer matcher) {
        matcher.setUseRegisteredSuffixPatternMatch(true);
    }

}

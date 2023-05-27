package com.demo;

import com.demo.beans.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@Configuration
public class AppConfig {
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public SpringBean1 springBean1(){
        return new SpringBean1();
    }
    @Bean
    public static CustomBeanFactoryPostProcessors customBeanFactoryPostProcessors(){
        return new CustomBeanFactoryPostProcessors();
    }

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor(){
        return new CustomBeanPostProcessor();
    }

}

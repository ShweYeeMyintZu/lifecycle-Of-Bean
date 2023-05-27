package com.demo;

import com.demo.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Bean Factory Post Processor is called
//        appConfig::postProcessBeforeInitialization
//        appConfig:::postProcessAfterInitialization
//        springBean2::postProcessBeforeInitialization
//        springBean2:::postProcessAfterInitialization
//                SpringBean1constructor
//        Setting Spring Bean 1 to ::SpringBean1
//        springBean1::postProcessBeforeInitialization
//        SpringBean1Post Construct
//        SpringBean1after properties set method
//        SpringBean1Custom Init
//        springBean1:::postProcessAfterInitialization
//                Hello
//        SpringBean1PreDestroy
//        Disposable Bean's Destroy Method
//        SpringBean1Custom Destroy
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        SpringBean1 springBean1=context.getBean(SpringBean1.class);
        System.out.println(springBean1.greeting());
    }
}

package com.demo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class SpringBean1 implements InitializingBean, DisposableBean {

    private SpringBean2 springBean2;

    public SpringBean1() {
        System.out.println(this.getClass().getSimpleName()+"constructor");

        this.springBean2 = springBean2;
    }



    @PostConstruct
    public void init(){
        System.out.println(this.getClass().getSimpleName()+"Post Construct");
        this.springBean2=springBean2;
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println(this.getClass().getSimpleName()+"PreDestroy");
        this.springBean2=springBean2;
    }
    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println("Setting Spring Bean 1 to ::"+this.getClass().getSimpleName());
        this.springBean2 = springBean2;
    }

    public void customInit(){
        System.out.println(this.getClass().getSimpleName()+"Custom Init");
    }

    public void customDestroy(){
        System.out.println(this.getClass().getSimpleName()+"Custom Destroy");
    }

    public String greeting(){
        return "Hello";
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName()+"after properties set method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean's Destroy Method");
    }
}

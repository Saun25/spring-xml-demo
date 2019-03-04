package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String name;

    public void display(){
        System.out.println("Bean Lifecycle"+getName());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties");
    }
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void customInit(){
        System.out.println("Initializing");
    }

    public void customDestroy(){
        System.out.println("Custom Destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

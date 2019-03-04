package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    BeanLifecycleDemoBean(){}
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

    public void display(){
        System.out.println("Bean Lifecycle");
    }
}

package com.sda.spring.example.beans;

import com.sda.spring.example.interfaces.BeanName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private BeanName name;

    public MyBean(@Qualifier("firstName") BeanName name){
        this.name = name;
    }

    public void setName(BeanName name){
        this.name = name;
    }

    public String sayHello(){
        return "Hello! " + name.getName();
    }
}

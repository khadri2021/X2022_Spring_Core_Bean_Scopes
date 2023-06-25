package com.khadri.spring.core.scope;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Bean1 bean1 = context.getBean("b1",Bean1.class);
        System.out.println(bean1);

        Bean1 bean2 = context.getBean("b1",Bean1.class);
        System.out.println(bean2);

        Bean2 bean3 = context.getBean("b2",Bean2.class);
        System.out.println(bean3);

        Bean2 bean4 = context.getBean("b2",Bean2.class);
        System.out.println(bean4);



    }
}
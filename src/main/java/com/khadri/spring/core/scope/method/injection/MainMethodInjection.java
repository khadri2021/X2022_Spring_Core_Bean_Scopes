package com.khadri.spring.core.scope.method.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethodInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Bus bus1 =  context.getBean("bus1",Bus.class);
        System.out.println(bus1);//Bus@1234
        System.out.println(bus1.getPassenger());//Passenger@1234

        Bus bus2 =  context.getBean("bus1",Bus.class);
        System.out.println(bus2);//Bus@1234
        System.out.println(bus2.getPassenger());//Passenger@1234

    }
}

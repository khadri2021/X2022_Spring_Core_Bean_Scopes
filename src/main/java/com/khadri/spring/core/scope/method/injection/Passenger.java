package com.khadri.spring.core.scope.method.injection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Passenger implements ApplicationContextAware {

   private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       this.context = applicationContext;
    }

    public Passenger createProtoTypePassenger(){
        return this.context.getBean("p1",Passenger.class);
    }
}

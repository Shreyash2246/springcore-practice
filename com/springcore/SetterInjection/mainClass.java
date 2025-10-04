package com.springcore.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SetterInjection/config.xml");
        student student1 = (student) context.getBean("student1");

        System.out.println(student1);
    }
}

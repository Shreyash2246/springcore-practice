package com.springcore.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SetterInjection/config.xml");
        
        student student1 = (student) context.getBean("student1");
        student student2 = (student) context.getBean("student2");
        student student3 = (student) context.getBean("student3");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        
    }
}

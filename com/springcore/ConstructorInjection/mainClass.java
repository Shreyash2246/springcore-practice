package com.springcore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ConstructorInjection/config.xml");
        
        Person person1 = (Person) context.getBean("person1");
        Person person2 = (Person) context.getBean("person2");
        Person person3 = (Person) context.getBean("person3");
        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}

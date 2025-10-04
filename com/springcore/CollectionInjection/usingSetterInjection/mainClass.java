package com.springcore.CollectionInjection.usingSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/CollectionInjection/usingSetterInjection/configFileUsingSetterInjectionforCollections.xml");

        employeeCollectionClass emp = context.getBean("emp1", employeeCollectionClass.class);
        System.out.println(emp);
    }
}

package com.springcore.TypesofReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        
        System.out.println("=== SETTER INJECTION METHODS ===");
        
        // Method 1: ref as element
        A obj1 = (A) context.getBean("setter_element");
        System.out.println("1. ref as ELEMENT: " + obj1);
        
        // Method 2: ref as attribute
        A obj2 = (A) context.getBean("setter_attribute");
        System.out.println("2. ref as ATTRIBUTE: " + obj2);
        
        // Method 3: P-schema
        A obj3 = (A) context.getBean("setter_p_schema");
        System.out.println("3. P-SCHEMA: " + obj3);
        
        System.out.println("\n=== CONSTRUCTOR INJECTION METHODS ===");
        
        // Constructor methods
        A obj4 = (A) context.getBean("constructor_element");
        System.out.println("1. Constructor ref as ELEMENT: " + obj4);
        
        A obj5 = (A) context.getBean("constructor_attribute");
        System.out.println("2. Constructor ref as ATTRIBUTE: " + obj5);
        
        A obj6 = (A) context.getBean("constructor_c_schema");
        System.out.println("3. C-SCHEMA: " + obj6);
    }
}

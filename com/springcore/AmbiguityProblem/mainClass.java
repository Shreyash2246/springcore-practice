package com.springcore.AmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/AmbiguityProblem/config.xml");
        
        System.out.println("=== Testing Ambiguity Solutions ===");
        
        try {
            Person p1 = (Person) context.getBean("ambiguousPerson");
            System.out.println("Ambiguous Person: " + p1);
        } catch (Exception e) {
            System.out.println("Error with ambiguous person: " + e.getMessage());
        }
        
        Person p2 = (Person) context.getBean("personWithType");
        System.out.println("Person with type: " + p2);
        
        Person p3 = (Person) context.getBean("personWithIndex");
        System.out.println("Person with index: " + p3);
        
        Person p4 = (Person) context.getBean("personWithName");
        System.out.println("Person with name: " + p4);
        
        Person p5 = (Person) context.getBean("personCombined");
        System.out.println("Person combined: " + p5);
    }
}

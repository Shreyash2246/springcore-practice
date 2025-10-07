package com.springcore.SpringLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("=== SPRING CONTAINER STARTING ===\n");
        
        // Use AbstractApplicationContext to get access to close() method
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpringLifecycle/config.xml");
        
        System.out.println("\n=== GETTING BEANS FROM CONTAINER ===\n");
        
        // Get beans (init methods already called during container startup)
        Samosa samosa1 = (Samosa) context.getBean("samosa1");
        System.out.println("Retrieved: " + samosa1);
        
        Samosa samosa2 = (Samosa) context.getBean("samosa2");
        System.out.println("Retrieved: " + samosa2);
        
        Pizza pizza1 = (Pizza) context.getBean("pizza1");
        System.out.println("Retrieved: " + pizza1);
        
        System.out.println("\n=== USING BEANS ===\n");
        System.out.println("Samosa 1 price: " + samosa1.getPrice());
        System.out.println("Pizza 1 size: " + pizza1.getSize());
        
        System.out.println("\n=== CLOSING SPRING CONTAINER ===\n");
        
        // Register shutdown hook to call destroy methods
        context.registerShutdownHook();
        
        // Or explicitly close the context
        // context.close();
        
        System.out.println("\n=== APPLICATION ENDED ===");
    }
}

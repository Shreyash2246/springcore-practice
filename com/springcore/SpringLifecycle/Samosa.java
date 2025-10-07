package com.springcore.SpringLifecycle;
//Example Bean with Lifecycle Methods

public class Samosa {
    private double price;
    
    // Constructor
    public Samosa() {
        super();
        System.out.println("Constructor: Creating Samosa object");
    }
    
    // Getter and Setter
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        System.out.println("Setter: Setting price = " + price);
        this.price = price;
    }
    
    // Custom INITIALIZATION method
    public void init() {
        System.out.println("INIT METHOD: Samosa is being prepared... heating oil, preparing ingredients");
        System.out.println("INIT METHOD: Samosa is ready to serve!");
    }
    
    // Custom DESTRUCTION method  
    public void destroy() {
        System.out.println("DESTROY METHOD: Samosa is being destroyed... cleaning up resources");
        System.out.println("DESTROY METHOD: Cleanup completed!");
    }
    
    @Override
    public String toString() {
        return "Samosa [price=" + price + "]";
    }
}

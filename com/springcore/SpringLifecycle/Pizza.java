package com.springcore.SpringLifecycle;
//Multiple Beans Example

public class Pizza {
    private String size;
    private double price;
    
    public Pizza() {
        System.out.println("Constructor: Pizza object created");
    }
    
    // Getters and Setters
    public String getSize() { return size; }
    public void setSize(String size) { 
        System.out.println("Setter: Setting size = " + size);
        this.size = size; 
    }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { 
        System.out.println("Setter: Setting price = " + price);
        this.price = price; 
    }
    
    // Lifecycle methods
    public void startMaking() {
        System.out.println("INIT: Pizza preparation started... preparing dough, adding toppings");
        System.out.println("INIT: Pizza is baked and ready!");
    }
    
    public void cleanUp() {
        System.out.println("DESTROY: Cleaning pizza oven and utensils");
        System.out.println("DESTROY: Pizza cleanup completed!");
    }
    
    @Override
    public String toString() {
        return "Pizza [size=" + size + ", price=" + price + "]";
    }
}

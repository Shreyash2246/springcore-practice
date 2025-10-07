package com.springcore.AmbiguityProblem;

public class Person {
    private String name;
    private String personId;
    private Certi certi;

    // commented to avoid ambiguity
    // public Person(String name, String personId) {
    //     this.name = name;
    //     this.personId = personId;
    //     System.out.println("Constructor: String, String");
    // }
    
    public Person(String name, Certi certi) {
        this.name = name;
        this.certi = certi;
        System.out.println("Constructor: String, Certi");
    }
    
    // This creates ambiguity - both parameters are Strings
    public Person(String personId, String name) {
        this.personId = personId;
        this.name = name;
        System.out.println("Constructor: String(id), String(name)");
    }
    
    // Getters and toString
    public String getName() { return name; }
    public String getPersonId() { return personId; }
    public Certi getCerti() { return certi; }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
    }
}

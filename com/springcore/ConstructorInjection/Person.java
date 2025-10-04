package com.springcore.ConstructorInjection;

public class Person {
    private String personName;
    private String personCity;
    private int personId;

    // parameterized constructor
    public Person(String personName, String personCity, int personId) {
        this.personName = personName;
        this.personCity = personCity;
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }
    
    public String getPersonCity() {
        return personCity;
    }
    
    public int getPersonId() {
        return personId;
    }
    
    @Override
    public String toString() {
        return "Person [personName=" + this.personName + ", personCity=" + this.personCity + ", personId=" + this.personId + "]";
    }
}

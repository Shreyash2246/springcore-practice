package com.springcore.TypesofReferenceInjection;

public class A {
    private int x;
    private B objB;  // Reference to B class
    
    public A() {
        super();
    }
    
    public A(int x, B objB) {
        this.x = x;
        this.objB = objB;
    }
    
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    
    public B getObjB() { return objB; }
    public void setObjB(B objB) { this.objB = objB; }
    
    @Override
    public String toString() {
        return "A [x=" + x + ", objB=" + objB + "]";
    }
}

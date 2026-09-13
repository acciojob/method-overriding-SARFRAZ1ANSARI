package com.driver;
// Task 1: Create class A
class A {

    public String meth() {
        return "Invoking method from class A";
    }
}


// Task 2: Create class B which extends class A
class B extends A {

    // Task 4: Override meth() from class A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // Task 3: Create object of class B
        B obj = new B();

        // Task 5: Call overridden method
        System.out.println(obj.meth());
    }
}


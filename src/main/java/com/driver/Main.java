package com.driver;
class A {

    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {

    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }

    public static void main(String[] args) {

        // Task 3
        B obj = new B();
        System.out.println(obj.meth());

        // Task 5
        System.out.println(obj.meth());
    }
}

package com.driver;
class Main {
        static class A {
            public String meth() {
                return "Invoking method from class A";
            }
        }
        static class B extends A {
            public String meth() {
                return "Method is overridden in Extendend class B";
            }
        }
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.meth());

        B b = new B();
        System.out.println(b.meth());
    }
    }

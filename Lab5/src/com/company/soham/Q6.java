package com.company.soham;

public class Q6 {
    public static void main(String[] args) {
        Child obj = new Child(2,4,7);
        System.out.println(obj.n);
    }
}

class Parent {
    int n;

    public Parent(int n) {
        this.n = n;
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    int a,b;

    public Child(int n, int a, int b) {
        super(n);
        this.a = a;
        this.b = b;
        System.out.println("Child Constructor");
    }
}

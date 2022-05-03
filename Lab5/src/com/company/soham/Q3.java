package com.company.soham;

//public class Q3 {
//    public static void main(String args[]) {
//        A a = new C();
//        B b = new B();
//        C c = new C();
//
//        A ref; //taking reference of parent class
//
//        ref = a;
//        ref.disp();
//        ref = b;
//        ref.disp();
//        ref = c;
//        ref.disp();
//    }
//
//}
//
//
//class A {
//    void disp() {
//        System.out.println("Inside A");
//    }
//}
//
//class B extends A {
//    @Override
//    void disp() {
//        System.out.println("Inside B");
//    }
//}
//class C extends A {
//    @Override
//    void disp() {
//        System.out.println("Inside C");
//    }
//}


public class Q3{
    public static void main(String[] args) {

        Shapes obj = new Shapes();
        obj.disp();

        Shapes ob3 = new Circle();
        ob3.disp();

    }
}

class Shapes{
    void disp(){
        System.out.println("Im in Shapes");
    }
}

class Triangle extends Shapes{
    @Override
    void disp(){
        System.out.println("Im in Triangle");
    }
}

class Circle extends Shapes{
    @Override
    void disp(){
        System.out.println("Im in Circle");
    }
}
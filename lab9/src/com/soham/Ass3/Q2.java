package com.soham.Ass3;

public class Q2 {
    public static void main(String[] args) {
        Shapes ob1=new Shapes();
        ob1.disp();

        Traingle ob2 = new Traingle();
        ob2.disp();

        Shapes ob3 = new Circle();
        ob3.disp();
    }
}

class Shapes {
    void disp(){
        System.out.println("Im in Shapes");
    }
}

class Circle extends Shapes{
    @Override
    void disp(){
        System.out.println("Im in Circle");
    }
}

class Traingle extends Shapes{
    @Override
    void disp(){
        System.out.println("Im in Triangle");
    }
}

package com.company.soham;

public class Q4 {
    public static void main(String[] args){
        circle c=new circle();
        System.out.println("Area of Circle: ");
        c.area(5);
        c.showArea();


        rectangle d=new rectangle();
        System.out.println("Area of Rectangle: ");
        d.area(8,3);
        d.showArea();
    }
}


class shape{
    double area;
    void showArea(){
        System.out.println(area);
    }
}

class circle extends shape{
    void area(int r){
        area = 3.14 * r * r;
    }
}

class rectangle extends shape{
    void area(int l,int b){
        area = l * b;
    }
}

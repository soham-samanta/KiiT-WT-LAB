package com.company.soham;

public class Q1 {
    public static void main(String[] args) {
        threeD t = new threeD(2,5,8);
        System.out.println("The cost of the 3D object is " + t.cost());

        twoD t1 = new twoD(5,2);
        System.out.println("The cost of the 2D object is " + t1.cost());
    }
}

class twoD {
    int length;
    int breadth;

    public twoD(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
    int cost () {
        return area() * 40;
    }
}

class threeD extends twoD {
    int height;

    public threeD(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }
    int cost () {
        return volume() * 60;
    }
}
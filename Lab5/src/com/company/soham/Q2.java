package com.company.soham;

public class Q2 {
    public static void main(String[] args) {
        wood obj=new wood(3,4,1,2);
        System.out.println(obj.l);
    }
}

class Plate{
    int l,b;

    public Plate(int l, int b) {
        this.l = l;
        this.b = b;
        System.out.println("Constructor: Plate");
    }
}

class box extends Plate{
    int h;

    public box(int l, int b, int h) {
        super(l, b);
        this.h = h;
        System.out.println("Constructor: box");
    }
}

class wood extends box{
    int t;

    public wood(int l, int b, int h, int t) {
        super(l, b, h);
        this.t = t;
        System.out.println("Constructor: wood");
    }
}

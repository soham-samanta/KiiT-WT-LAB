package com.soham;

public class NoObject {
    public static void main(String[] args) {

        Cnt ob1 = new Cnt();
        Cnt ob2 = new Cnt();
        Cnt ob3 = new Cnt();
        Cnt ob4 = new Cnt();
        Cnt ob5 = new Cnt();

        System.out.println("Number of Objects Created: " + Cnt.getObjects());
    }
}

class Cnt {
    public static int create =0;
    Cnt(){
        create++;
    }
    static int getObjects(){
        return create;
    }
}


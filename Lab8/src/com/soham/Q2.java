package com.soham;


public class Q2 {

    public static void main(String[] args) throws Exception {
        Q2 obj = new SubClass();
        obj.method();
    }

    void method() throws Exception {
//        System.out.println("SuperClass");
        throw new Exception("This is Super Class");
    }

}

class SubClass extends Q2 {
    public SubClass() {
        super();
    }
    void method() throws Exception {
//        System.out.println("SubClass");
        throw new Exception("This is SubClass");
    }
}
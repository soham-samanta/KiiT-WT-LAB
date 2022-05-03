package com.soham;

public class DestroyCnt {
    public static void main(String[] args) {
        DestroyCnt obj1 =new DestroyCnt();
        DestroyCnt obj2 =new DestroyCnt();

    }
}

class Counter{
    private static int destroy =0;
    Counter(){

    }
    @Override
    protected void finalize(){
        destroy++;
        System.out.println("Destroyed till now: " + destroy);
    }
}


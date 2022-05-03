package com.soham;

public class Q5 {
    public static void main(String[] args) throws Exception {
        int hour=29;
        int min=34;
        int sec=55;

        HrsException(hour);
        MinException(min);
        SecException(sec);

    }

    static void HrsException(int n) throws Exception{
        if(n>24 || n<0){
            throw new Exception("Hour Exception");
        }else{
            System.out.println("Hour: "+n);
        }
    }
    static void MinException(int n) throws Exception{
        if(n>60 || n<0){
            throw new Exception("Min Exception");
        }else{
            System.out.println("Minutes: "+n);
        }
    }
    static void SecException(int n) throws Exception{
        if(n>60 || n<0){
            throw new Exception("Sec Exception");
        }else{
            System.out.println("Seconds: "+n);
        }
    }

}




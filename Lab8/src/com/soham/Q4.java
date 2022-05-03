package com.soham;

public class Q4 {
    public static void main(String[] args) throws Exception {
        processInput(-5);
    }
    public static void processInput(int n) throws Exception{
        try{
            if(n<0){
                throw new Exception("NegativeNumberException");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println((double)n);
    }
}

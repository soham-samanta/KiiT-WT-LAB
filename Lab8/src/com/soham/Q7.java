package com.soham;

public class Q7 {
    private static final int minBal=500;

    public static void main(String[] args) throws Exception {
        int deposit= 1000;
        int withdraw=700;
        int rem=deposit-withdraw;

        account(rem);

    }

    public static void account(int n) throws Exception{
        if(n<minBal){
            throw new Exception("LessBalanceException");
        }else{
            System.out.println("Balance: "+n);
        }
    }
}

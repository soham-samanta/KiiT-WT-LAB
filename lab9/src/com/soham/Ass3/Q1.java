package com.soham.Ass3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) throws Exception {

        String Name;
        int Account_No;
        int Branch_Code;
        int Balance=1000;



        System.out.println(bankSystem(Balance));


    }

     static int bankSystem(int balance) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("*** Welcome to Soham Banking System ***");
        System.out.println("Menu:- (Please choose the correct option)");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check_Balance");
        System.out.print ("Choose Your Option: ");
        int n=sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Enter the amount you want to Deposit: ");
                int deposit=sc.nextInt();
                if(deposit<0){
                    throw new Exception("NegativeNumberException");
                }
                balance+=deposit;
                return balance;
            case 2:
                System.out.println("Enter the amount you want to Withdraw:");
                int withdraw= sc.nextInt();
                if(withdraw<0){
                    throw new Exception("Negative Number Exception");
                }
                balance-=withdraw;
                return balance;
            case 3:
                return balance;
            default:
                System.out.println("Invalid Option !!!");
                break;
        }
        return -1;
    }

}

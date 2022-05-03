package com.soham;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int n=sc.nextInt();
        if(n>=90 && n<=100){
            System.out.println("Grade-A");
        }else if(n>=80 && n<90){
            System.out.println("Grade-B");
        }else if(n>=70 && n<80){
            System.out.println("Grade-C");
        }else if(n>=60 && n<70){
            System.out.println("Grade-D");
        }else if(n>=50 && n<60){
            System.out.println("Grade-e");
        }else if(n>=0 && n<50){
            System.out.println("FAIL !!!");
        }else{
            System.out.println("Invalid Output!");
        }
    }
}

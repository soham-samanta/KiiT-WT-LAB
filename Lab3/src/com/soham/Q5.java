package com.soham;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String s1=sc.next();
        System.out.print("Enter your last name: ");
        String s2=sc.next();
        String ans=s2.concat(" "+ s1);
        System.out.println("Your Last name followed by first name is: "+ ans);
    }
}

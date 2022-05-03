package com.soham;

import java.util.Scanner;

public class Largest3 {

    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 numbers number: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if(x > y && x > z){
            System.out.println("Largest number is: "+x);
        }else if(y > z){
            System.out.println("Largest number is: "+y);
        }else{
            System.out.println("Largest number is: "+z);
        }
    }
}

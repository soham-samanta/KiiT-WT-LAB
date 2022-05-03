package com.soham;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Kiitian k=new Kiitian(20051107,100);
//        k.course();
//
//        WashingMachine ob =new WashingMachine();
//        ob.consume();
//        ob.run();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        int basic=sc.nextInt();

        Substaff obj =new Substaff();
        System.out.print("Earning: ");
        obj.earnings(basic);
        System.out.print("Bonus: ");
        obj.bonus(basic);
        System.out.print("Deduction: ");
        obj.deduction(basic);


    }
}

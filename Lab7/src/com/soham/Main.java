package com.soham;

import com.soham.Marketing.Sales;

public class Main {

    public static void main(String[] args) {
        Sales p1=new Sales(107,"Soham");
        System.out.println("Earning: "+p1.earning(20000));
        System.out.print("Final earning: ");
        p1.taAllowance();
    }
}

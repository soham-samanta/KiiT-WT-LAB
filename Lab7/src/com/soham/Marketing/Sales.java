package com.soham.Marketing;

import com.soham.General.Employee;

public class Sales extends Employee {
    public Sales(int empId, String eName) {
        super(empId, eName);
    }

    public void taAllowance(){
        int ta=earning(20000)*5/100;
        int ans=earning(20000)+ta;
        System.out.println(ans);
    }
}

package com.soham.General;

public class Employee {
    protected int empId;
    private String eName;
    public int earning(int basic){
        int da=basic*80/100;
        int hra=basic*15/100;
        int ans=basic+hra+da;
        return ans;
    }

    public Employee(int empId, String eName) {
        this.empId = empId;
        this.eName = eName;
    }
}

package com.soham;

public abstract class Manager implements Salary{

    @Override
    public void earnings(int basic) {
//        System.out.println(basic);
        int da=basic*80/100;
        int hra=basic*15/100;
        int ans=basic+hra+da;
        System.out.println(ans);
    }

    @Override
    public void deduction(int basic) {
        int pf=basic*12/100;
        System.out.println(pf);
    }
}

class Substaff extends Manager{

    @Override
    public void bonus(int basic) {
        int b=basic*50/100;
        System.out.println(b);
    }
}

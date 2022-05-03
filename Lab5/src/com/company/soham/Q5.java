package com.company.soham;

public class Q5 {
    public static void main(String[] args) {

        Person ob1 = new Person(1107,50000,"Soham Samanta",98767658);
        Person ob2 = new Person(2345,40000,"Aastha",5234454);
        Person ob3 = new Person(2134,70000,"Neelima",3523454);
        Person ob4 = new Person(3546,65000,"Nyaasha",4354261);
        Person ob5 = new Person(7632,80000,"Parth",5243556);
        ob4.show();

    }
}

class Account{
    int acc_no;
    int balance;

    public Account(int acc_no, int balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }
    void show(){
        System.out.println("*** Account Details ***");
        System.out.println("Account No: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}

class Person extends Account{
    String name;
    long aadhar;

    public Person(int acc_no, int balance, String name, long aadhar) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar = aadhar;
    }

    @Override
    void show(){
        System.out.println("*** Account Details ***");
        System.out.println("Name: "+name);
        System.out.println("Account No: "+acc_no);
        System.out.println("Balance: "+balance);
        System.out.println("Aadhar: "+aadhar);
    }
}
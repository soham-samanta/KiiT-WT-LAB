package com.soham;

public abstract class Student {
    int rollNo;
    int RegNo;

    public Student(int rollNo, int regNo) {
        this.rollNo = rollNo;
        RegNo = regNo;
    }

    abstract void course();
}

class Kiitian extends Student{

    public Kiitian(int rollNo, int regNo) {
        super(rollNo, regNo);
    }

    @Override
    void course() {
        System.out.println("I too CSE branch");
    }
}
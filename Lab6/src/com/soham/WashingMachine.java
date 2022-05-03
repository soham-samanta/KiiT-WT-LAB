package com.soham;

public class WashingMachine implements Motor{

    @Override
    public void run() {
        System.out.println("Motor is running");
    }

    @Override
    public void consume() {
        System.out.println("Motor is consuming petrol");
    }
}

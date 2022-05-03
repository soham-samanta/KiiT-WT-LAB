package com.soham;


public class Q6 {
    public static void main(String[] args) throws CheckArgumentException {
        if (args.length < 4) {
            throw new CheckArgumentException("Check Argument");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
            }
            System.out.println(sum);
        }
    }
}


class CheckArgumentException extends Exception {
    public CheckArgumentException(String s) {
        super(s);
    }
}



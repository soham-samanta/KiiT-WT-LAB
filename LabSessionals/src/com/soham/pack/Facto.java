package com.soham.pack;

public class Facto {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return(n * factorial(n-1));
        }
    }

//    public static int factorial(int n){
//        if (n == 0) {
//            return 1;
//        } else {
//            return(n * factorial(n-1));
//        }
//    }

}



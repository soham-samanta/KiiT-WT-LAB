package com.soham;

import java.util.Scanner;

import static java.lang.Math.pow;

public class W1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int x=5;
        float radian, ans = 0;

//        System.out.println("Enter value of x in degrees");
//        x=sc.nextInt();

        radian = (float) (x * (3.1415926 / 180.0)); // Convert Degree To Radian
        ans = calc(radian);
        System.out.println(ans);
    }

    public static float calc(float n) {
        int cnt, sign = 1;
        float res = 0;

        for(cnt = 1; (cnt <= 10); cnt += 2) {
            res  +=  (sign * ( pow(n, cnt) / factorial(cnt) ));
            sign *= -1;
        }
        return res;
    }

    public static float factorial(int n) {
        int count;
        float sum = 1;

        for(count = 1; count <= n; count++) {
            sum *= count;
        }
        return(sum);
    }
}

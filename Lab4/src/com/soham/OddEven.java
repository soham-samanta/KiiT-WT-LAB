package com.soham;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]arr=new int[10];
        System.out.println("Enter the 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        int oddCnt=0,evenCnt=0;
        for (int j = 0; j < 10; j++) {
            if(arr[j]%2==0){
                evenCnt++;
            }else{
                oddCnt++;
            }
        }
        System.out.println("Odd elements: "+oddCnt+" Even elements: "+evenCnt);
    }
}

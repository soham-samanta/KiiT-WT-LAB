package com.soham;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements do u want: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the "+n+" numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int [] newArr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int cnt = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                    newArr[j] = visited;
                }
            }
            if(newArr[i] != visited)
                newArr[i] = cnt;
        }

        System.out.println(" Element || Frequency");
        for(int i = 0; i < newArr.length; i++){
            if(newArr[i] != visited)
                System.out.println("    " + arr[i] + "    ||    " + newArr[i]);
        }
    }
}

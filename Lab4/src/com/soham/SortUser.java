package com.soham;

import java.util.Arrays;
import java.util.Scanner;

public class SortUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements do u want: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the "+n+" numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}

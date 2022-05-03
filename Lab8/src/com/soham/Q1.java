package com.soham;

public class Q1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        try{
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println();
//            System.out.println(e.getMessage());
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}

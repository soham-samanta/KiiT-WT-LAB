package com.soham;

import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        String fname;
        Scanner scan = new Scanner(System.in);

        // enter filename along with its extension
        System.out.print("Enter the Name of File: ");
        fname = scan.nextLine();

        String line = null;
        try {
            FileReader fr = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fr);

            while((line = bufferedReader.readLine()) != null) {
                String upper_case_line = "";
                Scanner lineScan = new Scanner(line);
                while(lineScan.hasNext()) {
                    String word = lineScan.next();
                    upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                }
                System.out.println(upper_case_line.trim());

//                System.out.println(line);
            }

            // always close the file after its use
            bufferedReader.close();
        } catch(IOException ex) {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
    }
}



package com.soham;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Q4 {
    public static void main(String[] arg) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name : ");
        String sfile = sc.next();

        System.out.print("Provide destination file name : ");
        String dfile = sc.next();

        FileReader fin = new FileReader(sfile);
        FileWriter fout = new FileWriter(dfile, true);

        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        System.out.println("Copy finish... Enjoy ");
        fin.close();
        fout.close();
    }
}
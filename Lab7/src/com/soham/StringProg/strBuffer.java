package com.soham.StringProg;

import java.util.Locale;

public class strBuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Soham");
        StringBuffer str = new StringBuffer("KiiT");
        System.out.println("Insert: "+s.insert(3,'L'));
        System.out.println("Reverse: "+s.reverse());

        boolean flag=false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Compare: "+flag);

        String m1=s.toString();
        System.out.println("UpperCase: "+m1.toLowerCase(Locale.ROOT));
        System.out.println("LowerCase: "+m1.toUpperCase(Locale.ROOT));
    }
}

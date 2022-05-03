package com.soham.StringProg;

public class str {
    public static void main(String[] args) {
        String s="SoHAm SAmanTA";
        System.out.println("LowerCase: "+changeCase(s));
        System.out.println("Reverse: "+rev(s));

        String str1= "kiit";
        String str2="KiiT";
        System.out.println("Compare: "+comp(str1,str2));

        System.out.println("Insert: "+insert(str1,str2));
    }

    public static String changeCase(String s){
        return s.toLowerCase();
    }

    public static String rev(String s){
        String ans="";
        for (int i=0; i<s.length(); i++) {
            char ch= s.charAt(i);
            ans= ch+ans;
        }
        return ans;
    }

    public static boolean comp(String s1, String s2){
        return s1.equals(s2);
    }

    public static String insert(String s1, String s2){
        return s1+s2;
    }

}

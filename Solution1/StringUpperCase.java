package com.java8Practise;

interface StringUpper  {
    String conversion(String a);
}

public class StringUpperCase {
    public static void main(String[] args) {

        String str = "hello this is abiha!";
        System.out.println("Original String :" + str);

        StringUpper obj = (a) -> a.toUpperCase();

        System.out.println("Converted to Upper Case :" + obj.conversion(str));
    }
}

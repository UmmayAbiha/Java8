package com.java8Practise;

// 1 c

interface Xyz {
    String concatenate(String a, String b);
}

public class StringConcat {
    public static void main(String[] args) {

        Xyz ob = (a, b) -> (a + " " + b);

        System.out.println("Concatenation of 2 Strings :" + (ob.concatenate("Hello", "World!")));
    }
}

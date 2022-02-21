package com.java8Practise;

// 1 b

interface Abc {
    int incrementNo(int n);
}

public class IncrementValue {
    public static void main(String[] args) {

        Abc obj = (n) -> ++n;

        System.out.println("Printing incremented values");
        System.out.println(("Increment value of 7 is : " + obj.incrementNo(7)));
        System.out.println("Increment value of 8 is : " + obj.incrementNo(8));

    }
}
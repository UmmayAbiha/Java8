package com.java8Practise;

//1 - Write the following a functional interface and implement it using lambda:
//    (a) First number is greater than second number or not             Parameter (int ,int ) Return boolean

interface GreaterNumber {
    boolean greaterNumber(int a, int b);
}

public class Test{
    public static void main(String[] args) {

        int x = 6;
        int y = 7;

        GreaterNumber ob = (int a, int b) -> {
            if (a > b)
                return true;
            else
                return false;
        };
        System.out.println(ob.greaterNumber(x,y));
        System.out.println();

        System.out.println(ob.greaterNumber(8,6));
    }
}


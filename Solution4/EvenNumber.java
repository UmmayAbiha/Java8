package com.java8Practise;

//WAP to Collect all  even numbers from a list using stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(1, 3, 4, 6, 7, 10, 34, 67, 31, 20);
                arrayList.stream();

        System.out.println("Even numbers collected are : " + arrayList.stream()
                .filter(e -> {
                    System.out.println(" e is : " + e);
                    boolean valueReturned = e % 2 == 0;
                    System.out.println("The returned value is : " + valueReturned);
                    return valueReturned;
                })
                .collect(Collectors.toList()));

    }
}

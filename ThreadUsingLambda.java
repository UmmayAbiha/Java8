package com.java8Practise;

//Create a thread using lambda function

public class ThreadUsingLambda {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println(Thread.currentThread()+ " is running!");
        new Thread(runnable).start();

        // or use
        Runnable runnable1 = () -> System.out.println("Running thread");
        new Thread(runnable1).start();
    }
}

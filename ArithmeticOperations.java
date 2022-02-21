package com.java8Practise;

interface OperationsInterface{
    int arithmeticOperations(int a, int b);
}

public class ArithmeticOperations {

    int instanceMethodAdd(int a,int b){
        System.out.println("Instance Method Add called");
        return a+b;
    }


    int instanceMethodSubtract(int a,int b){
        System.out.println("Instance Method Subtract called");
        return a-b;
    }

    static int staticMethodMultiply(int a,int b){
        System.out.println("Static Method Multiply");
        return a*b;
    }

    public static void main(String[] args) {

        OperationsInterface operationsInterfaceInstance1 = new ArithmeticOperations() :: instanceMethodAdd;
        System.out.println(operationsInterfaceInstance1.arithmeticOperations(9,8));

        OperationsInterface operationsInterfaceInstance2 = new ArithmeticOperations() :: instanceMethodSubtract;
        System.out.println(operationsInterfaceInstance2.arithmeticOperations(19,8));


        OperationsInterface operationsInterfaceStatic = ArithmeticOperations :: staticMethodMultiply;
        System.out.println(operationsInterfaceStatic.arithmeticOperations(7,8));
    }
}

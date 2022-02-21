package com.java8Practise;

//Implement multiple inheritance with default method inside interface.


interface parentInterface {
    default void display(){
        System.out.println("Hello this is the parent interface");
    }
}

interface childInterface1 extends parentInterface {
    default void display(){
        System.out.println("Hello this is the child1 interface");
    }
}

interface childInterface2 extends parentInterface {
    default void display(){
        System.out.println("Hello this is the child2 interface");
    }
}



public class InheritanceWithDefaultMethod implements childInterface1,childInterface2{
    public void display(){
        childInterface1.super.display();
        childInterface2.super.display();
        System.out.println("This is the default method");
    }

    public static void main(String[] args) {
        InheritanceWithDefaultMethod inheritanceWithDefaultMethod = new InheritanceWithDefaultMethod();
        inheritanceWithDefaultMethod.display();
    }
}

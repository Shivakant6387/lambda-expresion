package org.example.stream;

public class AbstractLambda {
    public static void main(String[] args) {
        // declare a reference to MyInterface
        MyInterface ref;

        // lambda expression
        ref = () -> 3.1415;

        System.out.println("Value of Pi = " + ref.getPiValue());
    }
}

package org.example.stream;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface=()-> "Hello World!";
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}

package org.example.stream;

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        Sayable sayable=()->{
            return "I have nothing to say";
        };
        System.out.println(sayable.say());
    }
}

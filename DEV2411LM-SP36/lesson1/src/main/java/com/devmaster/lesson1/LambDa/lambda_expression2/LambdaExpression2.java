package com.devmaster.lesson1.LambDa.lambda_expression2;
@FunctionalInterface
interface SayHello{
    void sayHello();
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        SayHello sayHello = () -> {
            System.out.println("Hello World");
        };
        sayHello.sayHello();
    }
}

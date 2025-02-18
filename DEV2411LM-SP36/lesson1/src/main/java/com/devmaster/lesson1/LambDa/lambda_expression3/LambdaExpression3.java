package com.devmaster.lesson1.LambDa.lambda_expression3;
@FunctionalInterface
interface SayHello2{
    public void sayHello(String name);
}
public class LambdaExpression3 {
    public static void main(String[] args) {
        //lambda su dung 1 tham so
        SayHello2 say1 = (name)->{
            System.out.println("Hello "+name);
        };
        say1.sayHello("Devmaster");

        // ngan gon
        SayHello2 say2 = name ->{
            System.out.println("Hello "+name);
        };
        say2.sayHello("Devmaster");

        // ngan gon hon
        SayHello2 say3 = name -> System.out.println("Hello "+name);
        say3.sayHello("Devmaster");
    }
}

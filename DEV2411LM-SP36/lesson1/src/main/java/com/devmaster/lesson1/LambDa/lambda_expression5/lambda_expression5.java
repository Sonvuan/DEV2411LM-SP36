package com.devmaster.lesson1.LambDa.lambda_expression5;

import java.util.Arrays;
import java.util.List;

public class lambda_expression5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "C#", "Netcore", "PHP", "JavaScript");
        // su dung lambda expression
        list.forEach(item -> System.out.println(item));
        System.out.println("=====================");
        list.forEach(System.out::println);
    }
}

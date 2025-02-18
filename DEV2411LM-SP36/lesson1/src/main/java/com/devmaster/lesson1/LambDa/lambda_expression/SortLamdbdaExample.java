package com.devmaster.lesson1.LambDa.lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLamdbdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "C#", "Netcore", "PHP", "JavaScript");
        Collections.sort(list,(String str1, String str2) -> str1.compareTo(str2));
        for (String str : list) {
            System.out.println(str);
        }
    }
}

package com.devmaster.lesson1.pkg_collection_api_enhencememts;

import java.util.Arrays;
import java.util.List;

public class ForEachListExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("English", "Spanish");

        System.out.println("Su dung bieu thuc Lambda: " );
        languages.forEach(lang -> System.out.println(lang));


        System.out.println("Su dung method reference: " );
        languages.forEach(System.out::println);
    }
}

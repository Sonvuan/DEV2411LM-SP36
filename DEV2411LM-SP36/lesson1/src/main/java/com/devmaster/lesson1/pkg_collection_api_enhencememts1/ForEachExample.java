package com.devmaster.lesson1.pkg_collection_api_enhencememts1;

import java.util.HashMap;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        // hien thi du lieu
        map.forEach((key, value) ->
                System.out.println(key + " - " + value));
    }
}

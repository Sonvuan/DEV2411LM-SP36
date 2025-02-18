package com.devmaster.lesson1.pkg_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StreamExample {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
    // đếm các số chẵn
    // không dùng stream

    public void withoutStream() {
        int count =0;
        for (Integer integer : integerList) {
            if(integer % 2 == 0){
                count++;
            }
        }
        System.out.println("WithoutStream -> So phan tu chan:" +count);
    }
    // dung Stream
    public void withStream() {
        Long count = integerList.stream().
                filter(num -> num % 2 == 0)
                .count();
        int sum = integerList.stream()
                .reduce(1, (a, b) -> a * b);  // 0 là giá trị khởi tạo

        System.out.println("Tổng: " + sum);  // In ra 15
        System.out.println("WithStream -> So phan tu chan:" +count);
    }
    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.withoutStream();
        streamExample.withStream();
    }
}

package com.devmaster.lesson1.method_ref;

import java.util.Arrays;

@FunctionalInterface
interface ExecuteFunction { // Sửa tên đúng chính tả
    int execute(int a, int b);
}

class MathUtils {
    public MathUtils() {}

    public MathUtils(String str) {
        System.out.println("MathUtils:" + str);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) { // Instance method
        return a * b;
    }
}

class DemoMethodRef {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Tham chiếu đến phương thức static
        int sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + "+" + b + "=" + sum);

        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + "-" + b + "=" + minus);

        // Tham chiếu đến phương thức instance
        MathUtils mathUtils = new MathUtils(); // Tạo đối tượng
        int multiply = doAction(a, b, mathUtils::multiply); // Sử dụng instance để gọi
        System.out.println(a + "*" + b + "=" + multiply);

        // Sắp xếp mảng với Method Reference
        String[] stringArray = {"Java", "C++", "php", "C#", "javaScript"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}

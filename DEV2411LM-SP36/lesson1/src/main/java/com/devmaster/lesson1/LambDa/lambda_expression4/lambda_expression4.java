package com.devmaster.lesson1.LambDa.lambda_expression4;
@FunctionalInterface
interface Calculator1{
    int add(int a, int b);
}
@FunctionalInterface
interface Calculator2{
    void add(int a, int b);
}
public class lambda_expression4 {
    public static void main(String[] args) {
        Calculator1 calc = (int a, int b) -> (a + b);
        System.out.println(calc.add(10, 20));

        Calculator1 calc2 = (a, b) -> a + b;
        System.out.println(calc2.add(10, 20));

        Calculator2 calc3 = (a,b) -> System.out.println(a+b);
        calc3.add(10, 20);

        Calculator2 calc4 = (a,b) ->{
            int sum = a+b;
            System.out.println(a+"+"+b+"="+sum);
        };
        calc4.add(10, 20);
    }
}

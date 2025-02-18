package com.devmaster.lesson1.pkg_default_method;


interface Interface1 {
    default void method1() {
        System.out.println("method1()");
    }

}
interface Interface2 {
    default void method2() {
        System.out.println("method2()");
    }

}
public class MultiInherristance implements Interface1, Interface2 {
    @Override
    public void method1() {
        Interface1.super.method1();
    }
    public void method2() {
        System.out.println("method2()");
    }
    public static void main(String [] args){
        MultiInherristance mi = new MultiInherristance();
        mi.method1();
        mi.method2();
    }
}

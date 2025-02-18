package com.devmaster.lesson1.LambDa.lambda_expression6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book{
    int id;
    String name;
    float price;
    public Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" +id+
                ", name='"+ name + '\''+
                ", price=" +price+
                '}';
    }
}
public class lambda_expression6 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "Lap trinh java", 9.5f));
        books.add(new Book(2, "Java SpringBoot", 19.5f));
        books.add(new Book(3, "PHP Laravel", 12.5f));
        books.add(new Book(4, "NetCore API", 29.5f));
        books.add(new Book(5, "JavaScript", 19.5f));


        books.stream().forEach(System.out::println);
        System.out.println("==================================");
        // loc sach co gia lon hon 15.000
        Stream<Book> filter = books.stream().filter(b -> b.price > 15);
        filter.forEach(System.out::println);
    }
}

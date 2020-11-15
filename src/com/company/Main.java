package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat1=new Cat("Iriska", 5, "orange", 6,"Main coon");
        Cat cat2=new Cat("Barsik", 1, "gray", 1, "British");
        Cat cat3=new Cat("Sonya", 10, "black", 4, "Persian");

        System.out.println(cat1.toString());
        System.out.println(cat1.oldest());
        System.out.println(cat2.toString());
        System.out.println(cat2.oldest());
        System.out.println(cat3.toString());
        System.out.println(cat3.oldest());
    }
}

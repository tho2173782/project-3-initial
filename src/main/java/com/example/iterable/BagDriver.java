package com.example.iterable;

public class BagDriver {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();

        bag.add("Apple");
        bag.add("Banana");
        bag.add("Cherry");

        System.out.println("Bag contents: " + bag);

        System.out.println("Bag size: " + bag.size());
        System.out.println("Is bag empty? " + bag.isEmpty());

        System.out.println("Iterating over bag contents:");
        for (String item : bag) {
            System.out.println(item);
        }

        System.out.println("Using forEach method:");
        bag.forEach(item -> System.out.println(item));

        System.out.println("Using spliterator:");
        bag.spliterator().forEachRemaining(System.out::println);
    }
}
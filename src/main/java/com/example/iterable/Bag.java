package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

//write a generic class Bag that implements the Container interface.
public class Bag<T> implements Container<T> {

    private List<T> items;

    public Bag() {
        items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    //implement the forEach and spliterator methods in the Bag class.

    @Override
    public void forEach(Consumer<? super T> action) {
        items.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag ");
        sb.append(items);
        return sb.toString();
    }
}
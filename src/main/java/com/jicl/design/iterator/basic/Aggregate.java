package com.jicl.design.iterator.basic;

import java.util.List;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/10 16:00
 */
public class Aggregate<T> {

    private List<T> array;

    public Aggregate(List<T> array) {
        this.array = array;
    }

    public List<T> getArray() {
        return array;
    }

    public Iterator<T> getIterator() {
        return new ConcreteIterator<>(this);
    }
}

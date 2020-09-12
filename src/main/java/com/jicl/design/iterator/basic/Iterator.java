package com.jicl.design.iterator.basic;

/**
 * 自定义的迭代器
 *
 * @author : xianzilei
 * @date : 2020/9/10 15:56
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}

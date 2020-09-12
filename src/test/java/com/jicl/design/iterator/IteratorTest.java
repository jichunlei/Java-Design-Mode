package com.jicl.design.iterator;

import com.jicl.design.iterator.basic.Aggregate;
import com.jicl.design.iterator.basic.Iterator;

import java.util.Arrays;
import java.util.List;

/**
 * 迭代器模式测试
 *
 * @author : xianzilei
 * @date : 2020/9/10 16:07
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Aggregate<Integer> aggregate = new Aggregate<>(list);
        Iterator<Integer> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

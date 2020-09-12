package com.jicl.design.iterator.basic;

/**
 * 自定义的迭代器实现类
 *
 * @author : xianzilei
 * @date : 2020/9/10 15:59
 */
public class ConcreteIterator<T> implements Iterator<T> {

    /**
     * 聚合对象
     */
    private Aggregate<T> aggregate;

    public ConcreteIterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * 索引位置
     */
    private int index = -1;

    @Override
    public boolean hasNext() {
        return index < aggregate.getArray().size() - 1;
    }

    @Override
    public T next() {
        return aggregate.getArray().get(++index);
    }
}

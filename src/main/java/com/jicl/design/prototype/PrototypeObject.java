package com.jicl.design.prototype;

/**
 * 原型类
 *
 * @author : xianzilei
 * @date : 2020/6/2 22:07
 */
public class PrototypeObject implements Cloneable {

    private String name;
    private int age;

    public PrototypeObject() {
    }

    public PrototypeObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package com.jicl.design.singleton;

/**
 * 单例模式：饿汉式写法一--静态常量
 *
 * @author : xianzilei
 * @date : 2020/6/1 21:14
 */
public class Singleton1 {

    //1.构造函数私有化
    private Singleton1() {

    }

    //2.创建对象实例
    private static Singleton1 instance = new Singleton1();

    //3.提供一个公有的静态方法返回实例对象
    public static Singleton1 getInstance() {
        return instance;
    }
}

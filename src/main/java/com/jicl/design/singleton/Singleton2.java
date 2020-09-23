package com.jicl.design.singleton;

/**
 * 单例模式：饿汉式写法二--静态代码块
 *
 * @author : xianzilei
 * @date : 2020/6/1 21:22
 */
public class Singleton2 {
    //1.构造函数私有化
    private Singleton2() {
    }

    //2.创建对象实例，通过静态代码块实例化
    private static Singleton2 instance;

    //3.通过静态代码块实例化
    static {
        instance = new Singleton2();
    }

    //4.提供一个公有的静态方法返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }
}

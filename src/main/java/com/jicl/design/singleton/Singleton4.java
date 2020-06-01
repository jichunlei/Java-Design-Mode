package com.jicl.design.singleton;

/**
 * 单例模式：懒汉式写法二--线程安全，但是效率低
 *
 * @author : xianzilei
 * @date : 2020/6/1 21:30
 */
public class Singleton4 {
    //1.构造函数私有化
    private Singleton4() {
    }

    //2.定义对象引用
    private static Singleton4 instance;

    //3.提供一个公有的静态方法返回实例对象
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}

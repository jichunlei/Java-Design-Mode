package com.jicl.design.singleton;

/**
 * 单例模式：懒汉式写法一--线程不安全
 *
 * @author : xianzilei
 * @date : 2020/6/1 21:24
 */
public class Singleton3 {
    //1.构造函数私有化
    private Singleton3() {
    }

    //2.定义对象引用
    private static Singleton3 instance;

    //3.提供一个公有的静态方法返回实例对象
    public static Singleton3 getInstance() {
        //如果未实例化，创建实例
        if (instance == null) {
            instance = new Singleton3();
        }
        //返回实例
        return instance;
    }
}

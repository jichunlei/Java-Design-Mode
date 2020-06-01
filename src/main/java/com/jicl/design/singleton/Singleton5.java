package com.jicl.design.singleton;

/**
 * 单例模式：懒汉式写法三--双重校验法
 *
 * @author : xianzilei
 * @date : 2020/6/1 21:32
 */
public class Singleton5 {
    //1.构造函数私有化
    private Singleton5() {
    }

    //2.定义对象引用
    private static volatile Singleton5 instance;

    //3.提供一个公有的静态方法返回实例对象
    public static synchronized Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}

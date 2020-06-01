package com.jicl.design.singleton;

/**
 * 单例模式：懒汉式写法四--静态内部类
 *
 * @author : xianzilei
 * @date : 2020/6/1 21:41
 */
public class Singleton6 {
    //1.构造函数私有化
    private Singleton6() {
    }

    //2.创建静态私有内部类，定义单例属性实例（静态内部类在主类装载时不会被装载）
    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    //3.提供一个公有的静态方法返回实例对象
    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

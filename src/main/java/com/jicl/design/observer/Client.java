package com.jicl.design.observer;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/11/4 17:59
 */
public class Client {

    public static void main(String[] args) {
        //创建报亭
        Newspaper subject = new Newspaper();

        //注册订阅者
        Reader reader1 = new Reader("张三");
        Reader reader2 = new Reader("李四");
        Reader reader3 = new Reader("王五");
        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        //报亭发布内容
        subject.publish("观察者模式");
    }
}

package com.jicl.design.singleton;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/22 19:28
 */
public class Client {
    public static void main(String[] args) {
        //获取实例1
        UidGenerator uidGenerator1 = UidGenerator.getInstance();
        //获取实例2
        UidGenerator uidGenerator2 = UidGenerator.getInstance();
        //判断实例1与实例2是否是同一实例
        System.out.println(uidGenerator1 == uidGenerator2);

        //分别使用实例1和实例2获取序列
        System.out.print(uidGenerator1.getNextId());
        System.out.print(uidGenerator2.getNextId());
        System.out.print(uidGenerator1.getNextId());
        System.out.print(uidGenerator2.getNextId());
        System.out.print(uidGenerator2.getNextId());
        System.out.print(uidGenerator1.getNextId());
    }
}

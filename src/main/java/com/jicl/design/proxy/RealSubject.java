package com.jicl.design.proxy;

/**
 * 真正的主题
 *
 * @author : xianzilei
 * @date : 2020/6/4 15:19
 */
public class RealSubject extends Subject {

    @Override
    public void operate() {
        System.out.println("执行真正的操作...");
    }
}

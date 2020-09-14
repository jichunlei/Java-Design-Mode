package com.jicl.design.proxy.staticproxy;

/**
 * 代理主题
 *
 * @author : xianzilei
 * @date : 2020/6/4 15:20
 */
public class ProxySubject extends Subject {

    private Subject realSubject;

    @Override
    public void operate() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.operate();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理...");
    }

    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理...");
    }

}

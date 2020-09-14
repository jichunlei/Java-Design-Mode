package com.jicl.design.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/14 22:27
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new LogMethodInterceptor());
        return enhancer.create();
    }
}

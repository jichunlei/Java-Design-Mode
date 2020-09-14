package com.jicl.design.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/14 22:31
 */
public class LogMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Cglib动态代理开始...");
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("Cglib动态代理结束...");
        return object;
    }
}

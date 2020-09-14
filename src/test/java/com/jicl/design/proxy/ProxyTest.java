package com.jicl.design.proxy;

import com.jicl.design.proxy.dynamicproxy.cglib.LogService;
import com.jicl.design.proxy.dynamicproxy.jdk.LogDao;
import com.jicl.design.proxy.dynamicproxy.jdk.LogDaoImpl;
import com.jicl.design.proxy.dynamicproxy.jdk.ProxyFactory;
import com.jicl.design.proxy.staticproxy.ProxySubject;
import com.jicl.design.proxy.staticproxy.Subject;
import org.junit.Test;

/**
 * 代理模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/4 15:28
 */
public class ProxyTest {

    @Test
    public void test() {
        Subject subject = new ProxySubject();
        subject.operate();
    }

    @Test
    public void test2() {
        //创建目标对象
        LogDao logDao = new LogDaoImpl();
        //创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(logDao);
        //创建代理对象
        LogDao proxyInstance = (LogDao) proxyFactory.getProxyInstance();

        proxyInstance.log();
    }

    @Test
    public void test3() {
        LogService target = new LogService();
        com.jicl.design.proxy.dynamicproxy.cglib.ProxyFactory proxyFactory =
                new com.jicl.design.proxy.dynamicproxy.cglib.ProxyFactory(target);
        LogService proxyInstance = (LogService) proxyFactory.getProxyInstance();
        proxyInstance.log();
    }
}

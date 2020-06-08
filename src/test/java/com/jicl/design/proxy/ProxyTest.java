package com.jicl.design.proxy;

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
}

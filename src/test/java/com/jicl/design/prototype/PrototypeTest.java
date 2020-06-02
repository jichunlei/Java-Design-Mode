package com.jicl.design.prototype;

import org.junit.Test;

/**
 * 原型模式测试类型
 *
 * @author : xianzilei
 * @date : 2020/6/2 22:09
 */
public class PrototypeTest {

    @Test
    public void test() throws CloneNotSupportedException {
        PrototypeObject object = new PrototypeObject("张三", 18);
        PrototypeObject clone = (PrototypeObject)object.clone();
        System.out.println(object==clone);
    }
}

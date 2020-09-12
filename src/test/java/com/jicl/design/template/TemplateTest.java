package com.jicl.design.template;

import org.junit.Test;

/**
 * 模板方法模式测试
 *
 * @author : xianzilei
 * @date : 2020/8/17
 */
public class TemplateTest {

    @Test
    public void test() {
        AbstractCookTemplate template1 = new VegetablesCook();
        AbstractCookTemplate template2 = new MeatCook();
        template1.cook();
        System.out.println("--------------------------------------");
        template2.cook();
    }
}

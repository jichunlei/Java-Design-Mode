package com.jicl.design.factorypatten.simplefactory;

import com.jicl.design.factorypatten.factorymethod.FactoryA;
import com.jicl.design.factorypatten.factorymethod.FactoryB;
import org.junit.Test;

/**
 * 工厂方法模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:05
 */
public class FactoryMethodTest {

    @Test
    public void test() {
        //生产A产品
        FactoryA factoryA = new FactoryA();
        factoryA.produce().show();

        //生产A产品
        FactoryB factoryB = new FactoryB();
        factoryB.produce().show();
    }
}

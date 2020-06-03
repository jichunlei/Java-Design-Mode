package com.jicl.design.factorypatten.simplefactory;

import com.jicl.design.factorypatten.abstractfactory.AbstractFactory;
import com.jicl.design.factorypatten.abstractfactory.ComputerEngineer;
import com.jicl.design.factorypatten.abstractfactory.IntelFactory;
import org.junit.Test;

/**
 * 抽象工厂模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:31
 */
public class AbstractFactoryTest {

    @Test
    public void test() {
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new IntelFactory();
//        AbstractFactory af = new AmdFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);
    }
}

package com.jicl.design.decorator;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 装饰者模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:38
 */
public class DecoratorTest {
    @Test
    public void testDecorator() {
        //点一杯黑咖啡，啥都不加
        AbstractCafe cafe1 = new BlackCafe();
        System.out.println(cafe1.getDescription() + "，花费" + cafe1.cost());

        //点一杯浓咖啡，加两份摩卡和一份豆浆
        AbstractCafe cafe2 = new ThickCafe();
        //加第一份摩卡
        cafe2 = new MochaCondiment(cafe2);
        //加第二份摩卡
        cafe2 = new MochaCondiment(cafe2);
        //加一份豆浆
        cafe2 = new SoyCondiment(cafe2);
        System.out.println(cafe2.getDescription() + "，花费" + cafe2.cost());

        //点一杯黑咖啡，加两份豆浆
        AbstractCafe cafe3 = new BlackCafe();
        //加第一份豆浆
        cafe3 = new SoyCondiment(cafe3);
        //加第二份豆浆
        cafe3 = new SoyCondiment(cafe3);
        System.out.println(cafe3.getDescription() + "，花费" + cafe3.cost());
    }

    @Test
    public void testInputStream() {
        int c = 0;
        InputStream in;
        try {
            in = new LowerCaseInputStream(getClass().getClassLoader().getResourceAsStream("test.txt"));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

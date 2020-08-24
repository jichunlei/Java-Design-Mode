package com.jicl.design.composite;

import org.junit.Test;

/**
 * 组合模式测试
 *
 * @author : xianzilei
 * @date : 2020/8/24 22:52
 */
public class CompositeTest {
    @Test
    public void test() {
        RegionComposite province1 = new Province(1, "安徽省");
        RegionComposite province2 = new Province(2, "浙江省");
        RegionComposite province3 = new Province(3, "江苏省");
        RegionComposite city11 = new City(11, "合肥市");
        RegionComposite city12 = new City(12, "芜湖市");
        RegionComposite city13 = new City(13, "淮南市");
        province1.add(city11);
        province1.add(city12);
        province1.add(city13);

        RegionComposite city21 = new City(21, "杭州市");
        RegionComposite city22 = new City(22, "温州市");
        RegionComposite city23 = new City(23, "宁波市");
        province2.add(city21);
        province2.add(city22);
        province2.add(city23);

        RegionComposite city31 = new City(31, "南京市");
        RegionComposite city32 = new City(32, "镇江市");
        RegionComposite city33 = new City(33, "苏州市");
        province3.add(city31);
        province3.add(city32);
        province3.add(city33);

        RegionComposite district1 = new District(101, "肥东县");
        RegionComposite district2 = new District(102, "三山区");
        RegionComposite district3 = new District(103, "凤台县");
        RegionComposite district4 = new District(104, "滨江区");
        RegionComposite district5 = new District(105, "永嘉县");
        RegionComposite district6 = new District(106, "象山县");
        RegionComposite district7 = new District(107, "滨江区");
        RegionComposite district8 = new District(108, "京口区");
        RegionComposite district9 = new District(109, "吴中区");
        city11.add(district1);
        city12.add(district2);
        city13.add(district3);
        city21.add(district4);
        city22.add(district5);
        city23.add(district6);
        city31.add(district7);
        city32.add(district8);
        city33.add(district9);

        province1.print();
        province2.print();
        province3.print();

    }
}

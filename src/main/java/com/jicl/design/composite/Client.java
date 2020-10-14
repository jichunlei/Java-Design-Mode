package com.jicl.design.composite;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/10/14 19:38
 */
public class Client {
    public static void main(String[] args) {
        //区/县
        RegionComposite district1 = new District("肥东县");
        RegionComposite district2 = new District("瑶海区");
        RegionComposite district3 = new District("三山区");
        //市
        RegionComposite city1 = new City("合肥市");
        city1.add(district1);
        city1.add(district2);
        City city2 = new City("芜湖市");
        city2.add(district3);
        //省
        RegionComposite province = new Province("安徽省");
        province.add(city1);
        province.add(city2);

        //打印信息
        province.print();
    }
}

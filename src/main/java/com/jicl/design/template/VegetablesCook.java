package com.jicl.design.template;

/**
 * 蔬菜
 *
 * @author : xianzilei
 * @date : 2020/8/17
 */
public class VegetablesCook extends AbstractCookTemplate {

    @Override
    public void prepareRawMaterials() {
        System.out.println("准备蔬菜...");
    }

    @Override
    public void addCondiment() {
        System.out.println("加生抽、盐...");
    }
}

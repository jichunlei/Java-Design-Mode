package com.jicl.design.template;

/**
 * 肉
 *
 * @author : xianzilei
 * @date : 2020/8/17
 */
public class MeatCook extends AbstractCookTemplate {

    @Override
    public void prepareRawMaterials() {
        System.out.println("准备肉...");
    }

    @Override
    public void boiledWater() {
        System.out.println("肉焯水...");
    }

    @Override
    public boolean needBoiledWater() {
        return true;
    }

    @Override
    public void addCondiment() {
        System.out.println("加老抽、生抽、酱油、盐...");
    }
}

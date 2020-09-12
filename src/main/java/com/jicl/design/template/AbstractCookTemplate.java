package com.jicl.design.template;

/**
 * 模板抽象类
 *
 * @author : xianzilei
 * @date : 2020/8/17
 */
public abstract class AbstractCookTemplate {


    public final void cook() {
        //开始
        start();
        //准备原材料
        prepareRawMaterials();
        //焯水
        if (needBoiledWater()) {
            boiledWater();
        }
        //加食用油
        addCookingOil();
        //加调味品
        addCondiment();
        //翻炒出锅结束
        end();
    }

    private void start() {
        System.out.println("烹饪开始...");
    }

    protected abstract void prepareRawMaterials();

    protected void boiledWater() {
    }

    protected boolean needBoiledWater() {
        return false;
    }

    protected void addCookingOil() {
        System.out.println("添加食用油...");
    }

    protected abstract void addCondiment();

    protected void end() {
        System.out.println("烹饪结束...");
    }
}

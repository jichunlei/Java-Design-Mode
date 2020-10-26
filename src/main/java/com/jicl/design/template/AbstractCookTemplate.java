package com.jicl.design.template;

/**
 * 模板抽象类
 *
 * @author : xianzilei
 * @date : 2020/8/17
 */
public abstract class AbstractCookTemplate {

    /**
     * 烹饪操作模板方法
     *
     * @return void
     * @author xianzilei
     * @date 2020/10/26 17:29
     **/
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

    //烹饪开始
    private void start() {
        System.out.println("烹饪开始...");
    }

    //添加油
    private void addCookingOil() {
        System.out.println("添加食用油...");
    }

    //烹饪结束
    private void end() {
        System.out.println("烹饪结束...");
    }
    /**------------以上三个方法是公共方法----------------*/

    //准备材料，子类负责实现
    protected abstract void prepareRawMaterials();

    //加调料，子类负责实现
    protected abstract void addCondiment();
    /**------------以上两个方法需要子类自己实现----------------*/

    //焯水，钩子方法，一般是空实现，由子类来覆写
    protected void boiledWater() {
    }
    //是否需要焯水，钩子方法，一般是默认实现，由子类选择性覆写
    protected boolean needBoiledWater() {
        return false;
    }
}

package com.jicl.design.builder;

/**
 * 抽象游戏角色
 *
 * @author : xianzilei
 * @date : 2020/9/25 10:58
 */
public abstract class AbstractGameRoleBuilder {
    /**
     * 游戏角色
     */
    protected GameRole gameRole;

    /**
     * 构造角色地位
     *
     * @return void
     * @author xianzilei
     * @date 2020/9/25 12:05
     **/
    public abstract void buildRolePosition();

    /**
     * 构造头发
     *
     * @return void
     * @author xianzilei
     * @date 2020/9/25 12:05
     **/
    public abstract void buildHair();

    /**
     * 构造性别
     *
     * @return void
     * @author xianzilei
     * @date 2020/9/25 12:05
     **/
    public abstract void buildSex();

    /**
     * 组装衣服
     *
     * @return void
     * @author xianzilei
     * @date 2020/9/25 12:05
     **/
    public abstract void buildClothes();


    /**
     * 组装武器
     *
     * @return void
     * @author xianzilei
     * @date 2020/9/25 12:04
     **/
    public abstract void buildArms();
}

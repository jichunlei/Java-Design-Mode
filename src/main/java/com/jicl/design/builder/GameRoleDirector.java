package com.jicl.design.builder;

/**
 * 角色创建指挥者
 *
 * @author : xianzilei
 * @date : 2020/9/30 11:03
 */
public class GameRoleDirector {

    /**
     * 构造器
     */
    private AbstractGameRoleBuilder builder;

    public GameRoleDirector(AbstractGameRoleBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbstractGameRoleBuilder builder) {
        this.builder = builder;
    }

    /**
     * 构建角色
     *
     * @return com.jicl.design.builder.GameRole
     * @author xianzilei
     * @date 2020/9/30 11:09
     **/
    public GameRole construct() {
        builder.buildRolePosition();
        builder.buildHair();
        builder.buildSex();
        builder.buildArms();
        builder.buildClothes();
        return builder.getGameRole();
    }
}

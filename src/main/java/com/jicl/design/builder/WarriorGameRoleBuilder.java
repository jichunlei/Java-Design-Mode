package com.jicl.design.builder;

/**
 * 战士射手角色构造器
 *
 * @author : xianzilei
 * @date : 2020/9/30 9:14
 */
public class WarriorGameRoleBuilder extends AbstractGameRoleBuilder {

    public WarriorGameRoleBuilder() {
        super.gameRole.setName("盖伦");
    }

    @Override
    public void buildRolePosition() {
        gameRole.setRolePosition("战士");
    }

    @Override
    public void buildHair() {
        gameRole.setHair("黑发");
    }

    @Override
    public void buildSex() {
        gameRole.setSex("男");
    }

    @Override
    public void buildClothes() {
        gameRole.setClothes("战士盔甲");
    }

    @Override
    public void buildArms() {
        gameRole.setArms("大宝剑");
    }
}

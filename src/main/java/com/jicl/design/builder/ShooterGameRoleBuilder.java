package com.jicl.design.builder;

/**
 * 射手角色构造器
 *
 * @author : xianzilei
 * @date : 2020/9/30 9:15
 */
public class ShooterGameRoleBuilder extends AbstractGameRoleBuilder {

    public ShooterGameRoleBuilder() {
        super.gameRole.setName("寒冰");
    }

    @Override
    public void buildRolePosition() {
        gameRole.setRolePosition("射手");
    }

    @Override
    public void buildHair() {
        gameRole.setHair("白色头发");
    }

    @Override
    public void buildSex() {
        gameRole.setSex("女");
    }

    @Override
    public void buildClothes() {
        gameRole.setClothes("女王嫁衣");
    }

    @Override
    public void buildArms() {
        gameRole.setArms("水晶箭");
    }
}

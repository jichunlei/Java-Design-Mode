package com.jicl.design.builder;

/**
 * 法师角色构造器
 *
 * @author : xianzilei
 * @date : 2020/9/25 16:46
 */
public class MageGameRoleBuilder extends AbstractGameRoleBuilder {

    public MageGameRoleBuilder() {
        super.gameRole.setName("瑞兹");
    }

    @Override
    public void buildRolePosition() {
        gameRole.setRolePosition("法师");
    }

    @Override
    public void buildHair() {
        gameRole.setHair("光头");
    }

    @Override
    public void buildSex() {
        gameRole.setSex("男");
    }

    @Override
    public void buildClothes() {
        gameRole.setClothes("法师服");
    }

    @Override
    public void buildArms() {
        gameRole.setArms("卷轴");
    }
}

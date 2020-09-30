package com.jicl.design.builder;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/30 9:22
 */
public class Client {
    public static void main(String[] args) {
        //构建法师角色
        AbstractGameRoleBuilder gameRoleBuilder = new MageGameRoleBuilder();
        GameRoleDirector director = new GameRoleDirector(gameRoleBuilder);
        GameRole gameRole = director.construct();
        System.out.println(gameRole);

        //构建射手角色
        AbstractGameRoleBuilder gameRoleBuilder2 = new ShooterGameRoleBuilder();
        director.setBuilder(gameRoleBuilder2);
        GameRole gameRole2 = director.construct();
        System.out.println(gameRole2);

        //构建战士角色
        AbstractGameRoleBuilder gameRoleBuilder3 = new WarriorGameRoleBuilder();
        director.setBuilder(gameRoleBuilder3);
        GameRole gameRole3 = director.construct();
        System.out.println(gameRole3);
    }
}

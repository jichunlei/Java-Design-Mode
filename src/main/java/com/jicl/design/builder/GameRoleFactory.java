package com.jicl.design.builder;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/30 11:28
 */
public class GameRoleFactory {
    /**
     * 构造角色
     *
     * @param type 1
     * @return com.jicl.design.builder.GameRole
     * @author xianzilei
     * @date 2020/9/30 11:37
     **/
    public static GameRole construct(String type) {
        //1-法师 2-射手 3-战士
        if ("1".equals(type)) {
            GameRole gameRole = new GameRole();
            gameRole.setName("瑞兹");
            gameRole.setRolePosition("法师");
            gameRole.setHair("光头");
            gameRole.setSex("男");
            gameRole.setClothes("法师服");
            gameRole.setArms("卷轴");
            return gameRole;
        } else if ("2".equals(type)) {
            GameRole gameRole = new GameRole();
            gameRole.setName("寒冰");
            gameRole.setRolePosition("射手");
            gameRole.setHair("白色头发");
            gameRole.setSex("女");
            gameRole.setClothes("女王嫁衣");
            gameRole.setArms("水晶箭");
            return gameRole;

        } else if ("3".equals(type)) {
            GameRole gameRole = new GameRole();
            gameRole.setName("盖伦");
            gameRole.setRolePosition("战士");
            gameRole.setHair("黑发");
            gameRole.setSex("男");
            gameRole.setClothes("战士盔甲");
            gameRole.setArms("大宝剑");
            return gameRole;
        } else {
            throw new RuntimeException("不支持的类型");
        }
    }
}

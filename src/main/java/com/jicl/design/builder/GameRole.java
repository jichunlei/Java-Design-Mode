package com.jicl.design.builder;

/**
 * 游戏角色
 *
 * @author : xianzilei
 * @date : 2020/9/25 14:50
 */
public class GameRole {

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色定位
     */
    private String rolePosition;
    /**
     * 头发
     */
    private String hair;
    /**
     * 性别
     */
    private String sex;
    /**
     * 衣服
     */
    private String clothes;
    /**
     * 武器
     */
    private String arms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRolePosition() {
        return rolePosition;
    }

    public void setRolePosition(String rolePosition) {
        this.rolePosition = rolePosition;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name).append('\n');
        sb.append("角色定位：").append(rolePosition).append('\n');
        sb.append("头发：").append(hair).append('\n');
        sb.append("性别：").append(sex).append('\n');
        sb.append("服装：").append(clothes).append('\n');
        sb.append("武器：").append(arms).append('\n');
        return sb.toString();
    }
}

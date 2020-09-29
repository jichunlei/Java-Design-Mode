package com.jicl.design.builder;

/**
 * 游戏角色
 *
 * @author : xianzilei
 * @date : 2020/9/25 14:50
 */
public class GameRole {
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
        final StringBuilder sb = new StringBuilder("GameRole{");
        sb.append("rolePosition='").append(rolePosition).append('\'');
        sb.append(", hair='").append(hair).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", clothes='").append(clothes).append('\'');
        sb.append(", arms='").append(arms).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

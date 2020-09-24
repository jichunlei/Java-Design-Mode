package com.jicl.design.prototype;

/**
 * 个人订单
 *
 * @author : xianzilei
 * @date : 2020/9/24 15:43
 */
public class PersonalOrder extends AbstractOrder {
    /**
     * 会员ID
     */
    private String memberId;
    /**
     * 会员姓名
     */
    private String memberName;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public AbstractOrder selfCopy() {
        PersonalOrder copy = new PersonalOrder();
        copy.setMemberId(this.memberId);
        copy.setMemberName(this.memberName);
        copy.setGoodsNum(getGoodsNum());
        return copy;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalOrder{");
        sb.append("memberId='").append(memberId).append('\'');
        sb.append(", memberName='").append(memberName).append('\'');
        sb.append(", goodsNum='").append(getGoodsNum()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

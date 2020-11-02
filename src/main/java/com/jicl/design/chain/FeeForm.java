package com.jicl.design.chain;

/**
 * 报销单
 *
 * @author : xianzilei
 * @date : 2020/10/30 19:58
 */
public class FeeForm {

    /**
     * 报销单号
     */
    private Integer id;
    /**
     * 报销金额
     */
    private double amount;
    /**
     * 报销人姓名
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

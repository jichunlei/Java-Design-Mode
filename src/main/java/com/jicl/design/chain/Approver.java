package com.jicl.design.chain;

/**
 * 抽象审批类
 *
 * @author : xianzilei
 * @date : 2020/11/2 19:12
 */
public abstract class Approver {

    /**
     * 后继审批者
     */
    private Approver next;

    public Approver getNext() {
        return next;
    }

    public void setNext(Approver next) {
        this.next = next;
    }

    /**
     * 审批
     *
     * @param feeForm 1
     * @return void
     * @author xianzilei
     * @date 2020/11/2 19:13
     **/
    public abstract void approve(FeeForm feeForm);
}

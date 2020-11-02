package com.jicl.design.chain;

/**
 * 项目经理
 *
 * @author : xianzilei
 * @date : 2020/11/2 19:15
 */
public class ProjectManagerApprover extends Approver {

    public ProjectManagerApprover() {
    }

    public ProjectManagerApprover(Approver next) {
        setNext(next);
    }
    @Override
    public void approve(FeeForm feeForm) {
        if (feeForm.getAmount() < 1000) {
            System.out.println(
                    "项目经理同意" + feeForm.getName() + "的" + feeForm.getAmount() + "元的报销申请");
        } else {
            Approver next = getNext();
            if (next != null) {
                next.approve(feeForm);
            } else {
                System.out.println("金额过大，无人审批！");
            }
        }
    }
}

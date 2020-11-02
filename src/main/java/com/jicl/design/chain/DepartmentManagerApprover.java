package com.jicl.design.chain;

/**
 * 部门经理
 *
 * @author : xianzilei
 * @date : 2020/11/2 19:16
 */
public class DepartmentManagerApprover extends Approver {

    public DepartmentManagerApprover() {
    }

    public DepartmentManagerApprover(Approver next) {
        setNext(next);
    }

    @Override
    public void approve(FeeForm feeForm) {
        if (feeForm.getAmount() >= 1000 && feeForm.getAmount() <= 5000) {
            System.out.println(
                    "部门经理同意" + feeForm.getName() + "的" + feeForm.getAmount() + "元的报销申请");
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

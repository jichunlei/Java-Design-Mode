package com.jicl.design.chain;

import java.util.UUID;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/11/2 18:58
 */
public class Client {

    public static void main(String[] args) {
        FeeForm feeForm1 = new FeeForm();
        feeForm1.setAmount(499);
        feeForm1.setName("张三");
        FeeForm feeForm2 = new FeeForm();
        feeForm2.setAmount(3982);
        feeForm2.setName("张三");
        FeeForm feeForm3 = new FeeForm();
        feeForm3.setAmount(20000);
        feeForm3.setName("张三");

        Approver approver = new ProjectManagerApprover(new DepartmentManagerApprover(new GeneralManagerApprover()));
        approver.approve(feeForm1);
        approver.approve(feeForm2);
        approver.approve(feeForm3);
    }
}

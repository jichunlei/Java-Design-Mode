package com.jicl.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 房产中介
 *
 * @author : xianzilei
 * @date : 2020/11/9 18:56
 */
public class EstateMediator implements Mediator {

    /**
     * 注册在该房产公司的客户（包括卖方和买方）
     */
    private List<Customer> members = new ArrayList<>();

    @Override
    public void register(Customer member) {
        members.add(member);
        member.setMediator(this);
    }

    @Override
    public void relay(String from, String msg) {
        for (Customer member : members) {
            if (!member.getName().equals(from)) {
                System.out.println("中介小哥传递" + from + "发送的消息[" + msg + "]给" + member.getName());
            }
        }
    }
}

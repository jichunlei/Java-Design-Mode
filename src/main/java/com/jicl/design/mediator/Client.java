package com.jicl.design.mediator;

import java.io.IOException;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/11/9 19:16
 */
public class Client {

    public static void main(String[] args) throws IOException {
        //定义中介者
        Mediator mediator = new EstateMediator();

        //定义卖方和买方客户
        Customer buyer = new Buyer("张三");
        Customer seller = new Seller("李四");

        //买方和卖方注册到中介公司中
        mediator.register(buyer);
        mediator.register(seller);

        //卖方买方对话，中介者负责传递消息
        seller.send("临近地铁的大三居开始出售了！");
        buyer.send("多大面积啊？");
        seller.send("三室一厅120多平。");
        buyer.send("多少钱啊？");
        seller.send("200万整。");
    }
}

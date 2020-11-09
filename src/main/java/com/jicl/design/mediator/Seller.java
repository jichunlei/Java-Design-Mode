package com.jicl.design.mediator;

/**
 * 卖方
 *
 * @author : xianzilei
 * @date : 2020/11/9 19:03
 */
public class Seller extends Customer {

    public Seller(String name) {
        super(name);
    }

    @Override
    public void send(String msg) {

        mediator.relay(getName(), msg);
    }
}

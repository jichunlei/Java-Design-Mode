package com.jicl.design.mediator;

/**
 * 买方
 *
 * @author : xianzilei
 * @date : 2020/11/9 19:04
 */
public class Buyer extends Customer {

    public Buyer(String name) {
        super(name);
    }

    @Override
    public void send(String msg) {
        mediator.relay(getName(), msg);
    }
}

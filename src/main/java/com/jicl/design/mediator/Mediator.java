package com.jicl.design.mediator;

/**
 * 抽象中介
 *
 * @author : xianzilei
 * @date : 2020/11/9 18:55
 */
public interface Mediator {

    /**
     * 客户注册
     *
     * @param member 1
     * @return void
     * @author xianzilei
     * @date 2020/11/9 19:10
     **/
    void register(Customer member);

    /**
     * 转发客户发的消息到其余客户
     *
     * @param from 发信息的客户
     * @param msg  具体消息
     * @return void
     * @author xianzilei
     * @date 2020/11/9 19:09
     **/
    void relay(String from, String msg);
}

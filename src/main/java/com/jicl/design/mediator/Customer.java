package com.jicl.design.mediator;

/**
 * 抽象客户
 *
 * @author : xianzilei
 * @date : 2020/11/9 18:59
 */
public abstract class Customer {

    /**
     * 中介者
     */
    protected Mediator mediator;
    /**
     * 客户姓名
     */
    private String name;


    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 发送消息
     *
     * @param msg 消息内容
     * @return void
     * @author xianzilei
     * @date 2020/11/9 19:00
     **/
    public abstract void send(String msg);
}

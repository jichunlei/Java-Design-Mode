package com.jicl.design.observer;

/**
 * 读者（观察者）
 *
 * @author : xianzilei
 * @date : 2020/11/4 17:53
 */
public class Reader implements Observer {

    /**
     * 读者姓名
     */
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到报纸，本期内容为：" + ((Newspaper) subject).getContent());
    }
}

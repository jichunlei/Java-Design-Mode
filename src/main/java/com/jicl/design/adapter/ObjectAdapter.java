package com.jicl.design.adapter;

/**
 * 对象适配器
 *
 * @author : xianzilei
 * @date : 2020/6/4 10:09
 */
public class ObjectAdapter implements Target {

    //直接关联被适配类
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        // 使用委托的方式完成特殊功能
        adaptee.specificRequest();
    }
}

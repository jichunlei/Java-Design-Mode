package com.jicl.design.adapter;

/**
 * 类适配器
 *
 * 为使Target能够使用Adaptee类里的SpecificRequest方法，
 * 故提供一个中间环节Adapter类（继承Adaptee & 实现Target接口），
 * 把Adaptee的API与Target的API衔接起来（适配）
 *
 * Adapter与Adaptee是继承关系，这决定了这个适配器模式是类的
 *
 * @author : xianzilei
 * @date : 2020/6/4 09:55
 */
public class ClassAdapter extends Adaptee implements Target {
    public void request() {
        specificRequest();
    }
}

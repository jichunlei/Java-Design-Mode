package com.jicl.design.facade;

/**
 * 外观类
 *
 * @author : xianzilei
 * @date : 2020/9/9 12:45
 */
public class Facade {
    AirConditioning airConditioning = new AirConditioning();
    Light light = new Light();
    Mobile mobile = new Mobile();
    Television television = new Television();

    public void sleep() {
        mobile.off();
        television.off();
        airConditioning.on();
        light.off();
        System.out.println("准备睡觉...");
    }

    public void getUp() {
        System.out.println("开始起床...");
        light.on();
        airConditioning.off();
        television.on();
        mobile.on();
    }
}

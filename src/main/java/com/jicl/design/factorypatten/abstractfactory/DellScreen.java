package com.jicl.design.factorypatten.abstractfactory;

/**
 * 戴尔屏幕
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:02
 */
public class DellScreen implements Screen{
    @Override
    public void show() {
        System.out.println("戴尔屏幕");
    }
}

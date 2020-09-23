package com.jicl.design.factorypatten.abstractfactory;

/**
 * 联想屏幕
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:02
 */
public class LenovoScreen implements Screen{
    @Override
    public void show() {
        System.out.println("联想屏幕");
    }
}

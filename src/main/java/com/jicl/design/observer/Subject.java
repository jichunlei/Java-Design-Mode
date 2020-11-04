package com.jicl.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 *
 * @author : xianzilei
 * @date : 2020/11/4 15:35
 */
public class Subject {

    /**
     * 订阅者
     **/
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param observer 1
     * @return void
     * @author xianzilei
     * @date 2020/11/4 16:12
     **/
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 取消注册
     *
     * @param observer 1
     * @return void
     * @author xianzilei
     * @date 2020/11/4 16:13
     **/
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知订阅者
     *
     * @return void
     * @author xianzilei
     * @date 2020/11/4 17:48
     **/
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

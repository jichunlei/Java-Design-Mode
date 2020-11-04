package com.jicl.design.observer;

/**
 * 观察者
 *
 * @author : xianzilei
 * @date : 2020/11/4 15:35
 */
public interface Observer {

    /**
     * 被通知的方法
     *
     * @param subject 1
     * @return void
     * @author xianzilei
     * @date 2020/11/4 15:37
     **/
    void update(Subject subject);
}

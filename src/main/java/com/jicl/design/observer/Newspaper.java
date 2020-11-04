package com.jicl.design.observer;

/**
 * 报纸
 *
 * @author : xianzilei
 * @date : 2020/11/4 17:51
 */
public class Newspaper extends Subject {
    /**
     * 报纸内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    /**
     * 发布内容，并通知订阅者
     *
     * @param content 1
     * @return void
     * @author xianzilei
     * @date 2020/11/4 18:44
     **/
    public void publish(String content) {
        //发布新报纸
        this.content = content;
        //通知观察者
        notifyObservers();
    }
}

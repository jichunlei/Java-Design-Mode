package com.jicl.design.proxy.dynamicproxy.jdk;

/**
 * 日志接口实现类
 *
 * @author : xianzilei
 * @date : 2020/9/14 21:40
 */
public class LogDaoImpl implements LogDao {
    @Override
    public void log() {
        System.out.println("记录日志中...");
    }
}

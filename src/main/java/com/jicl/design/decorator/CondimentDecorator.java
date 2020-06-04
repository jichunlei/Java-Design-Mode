package com.jicl.design.decorator;

/**
 * 调料装饰抽象类（抽象装饰构件）
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:31
 */
public abstract class CondimentDecorator extends AbstractCafe {
    @Override
    public abstract String getDescription();
}

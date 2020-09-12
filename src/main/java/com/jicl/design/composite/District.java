package com.jicl.design.composite;

/**
 * 区县
 *
 * @author : xianzilei
 * @date : 2020/8/24 22:43
 */
public class District extends RegionComposite {

    public District(Integer code, String name) {
        super(code, name);
    }

    @Override
    public void print() {
        System.out.println("----"+getCode() + ":" + getName());
    }
}

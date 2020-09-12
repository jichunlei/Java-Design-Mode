package com.jicl.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 市
 *
 * @author : xianzilei
 * @date : 2020/8/24 22:43
 */
public class City extends RegionComposite {

    private List<RegionComposite> childList = new ArrayList<RegionComposite>();

    public City(Integer code, String name) {
        super(code, name);
    }

    @Override
    protected void add(RegionComposite regionComposite) {
        childList.add(regionComposite);
    }

    @Override
    protected void remove(RegionComposite regionComposite) {
        childList.remove(regionComposite);
    }

    @Override
    public void print() {
        System.out.println("--" + getCode() + ":" + getName());
        for (RegionComposite regionComposite : childList) {
            regionComposite.print();
        }
    }
}

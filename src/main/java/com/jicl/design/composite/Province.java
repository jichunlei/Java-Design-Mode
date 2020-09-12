package com.jicl.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 省
 *
 * @author : xianzilei
 * @date : 2020/8/24 22:43
 */
public class Province extends RegionComposite {

    private List<RegionComposite> childList = new ArrayList<RegionComposite>();

    public Province(Integer code, String name) {
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
        System.out.println(getCode() + ":" + getName());
        for (RegionComposite regionComposite : childList) {
            regionComposite.print();
        }
    }
}

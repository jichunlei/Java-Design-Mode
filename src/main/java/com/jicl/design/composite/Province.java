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
    /**
     * 子区域信息
     */
    private List<RegionComposite> childList = new ArrayList<RegionComposite>();

    public Province(String name) {
        super(name);
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
        System.out.println(getName());
        for (RegionComposite regionComposite : childList) {
            regionComposite.print();
        }
    }
}

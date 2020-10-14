package com.jicl.design.composite;

/**
 * 区域组件
 *
 * @author : xianzilei
 * @date : 2020/8/24 22:40
 */
public abstract class RegionComposite {
    /**
     * 区域名称
     */
    private String name;

    protected RegionComposite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 新增子区域信息
     * @author xianzilei
     **/
    protected void add(RegionComposite regionComposite) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除子区域信息
     * @author xianzilei
     **/
    protected void remove(RegionComposite regionComposite) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印区域信息
     *
     * @author xianzilei
     **/
    public abstract void print();
}

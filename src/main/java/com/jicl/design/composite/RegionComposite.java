package com.jicl.design.composite;

/**
 * 区域组件
 *
 * @author : xianzilei
 * @date : 2020/8/24 22:40
 */
public abstract class RegionComposite {
    private Integer code;
    private String name;

    protected RegionComposite(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void add(RegionComposite regionComposite) {
        throw new UnsupportedOperationException();
    }

    protected void remove(RegionComposite regionComposite) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}

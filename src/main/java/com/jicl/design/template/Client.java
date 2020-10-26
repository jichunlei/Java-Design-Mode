package com.jicl.design.template;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/10/26 17:36
 */
public class Client {
    public static void main(String[] args) {
        //烹饪蔬菜
        AbstractCookTemplate vegetablesCook = new VegetablesCook();
        vegetablesCook.cook();

        System.out.println("------------------------------------");

        //烹饪肉
        AbstractCookTemplate meatCook = new MeatCook();
        meatCook.cook();
    }
}

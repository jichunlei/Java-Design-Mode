package com.jicl.design.facade;

/**
 * 客户端
 *
 * @author : xianzilei
 * @date : 2020/9/9 12:45
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.sleep();
        System.out.println("========================================");
        facade.getUp();
    }


}

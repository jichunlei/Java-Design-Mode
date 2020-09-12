package com.jicl.design.flyweight;

/**
 * 客户端
 *
 * @author : xianzilei
 * @date : 2020/9/9 16:35
 */
public class FlyweightTest {

    public static void main(String[] args) {
        WebsiteFlyweight websiteFlyweight1 = FlyweightFactory.createWebsiteFlyweight("网页");
        websiteFlyweight1.show();
        WebsiteFlyweight websiteFlyweight2 = FlyweightFactory.createWebsiteFlyweight("网页");
        websiteFlyweight2.show();
        WebsiteFlyweight websiteFlyweight3 = FlyweightFactory.createWebsiteFlyweight("网页");
        websiteFlyweight3.show();
        System.out.println(websiteFlyweight1==websiteFlyweight2);
        System.out.println(websiteFlyweight2==websiteFlyweight3);
        System.out.println("================================================");

        WebsiteFlyweight websiteFlyweight4 = FlyweightFactory.createWebsiteFlyweight("图片");
        websiteFlyweight4.show();
        WebsiteFlyweight websiteFlyweight5 = FlyweightFactory.createWebsiteFlyweight("图片");
        websiteFlyweight5.show();
        System.out.println(websiteFlyweight4==websiteFlyweight5);
        System.out.println("================================================");

        WebsiteFlyweight websiteFlyweight6 = FlyweightFactory.createWebsiteFlyweight("视频");
        websiteFlyweight6.show();
        WebsiteFlyweight websiteFlyweight7 = FlyweightFactory.createWebsiteFlyweight("视频");
        websiteFlyweight7.show();
        System.out.println(websiteFlyweight6==websiteFlyweight7);
    }
}

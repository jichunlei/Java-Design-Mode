package com.jicl.design;

/**
 * @describe: 饿汉式：1）直接实例化对象（简答）
 * 	3）、使用静态代码块（适合复杂情况下的实例化）
 * @author: xianzilei
 * @date: 2019年8月21日
 */
public class Singleton1 {
	//1）直接实例化对象
	public static final Singleton1 INSTANCE=new Singleton1();
	//构造方法私有化
	private Singleton1() {
	}
}
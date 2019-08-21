package com.jicl.design;

/**
 * 
 * @author xianzilei
 *
 */
public class Singleton1 {
	public static final Person INSTANCE=new Person();
	//构造方法私有化
	private Singleton1() {
	}
}

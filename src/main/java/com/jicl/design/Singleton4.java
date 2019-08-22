package com.jicl.design;

/**
 * @describe: 懒汉式：1）、使用单线程（线程不安全）
 * @author: xianzilei
 * @date: 2019年8月21日
 */
public class Singleton4 {
	//单例对象
	private static Singleton4 instance;
	
	private Singleton4() {
	}
	
	/**
	 * 需要时候才创建
	 * @return
	 */
	public static Singleton4 getInstance() {
		//如果为空则新new对象（存在线程安全问题）
		if(instance==null) {
			instance=new Singleton4();
		}
		return instance;
	}
}
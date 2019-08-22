package com.jicl.design;

import java.util.Properties;

/**
 * @describe: 饿汉式：3）、使用静态代码块（适合复杂情况下的实例化）
 * @author: xianzilei
 * @date: 2019年8月21日
 */
public class Singleton3 {
	public static final Singleton3 INSTANCE;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//使用静态代码块
	static {
		Properties properties=new Properties();
		try {
			properties.load(Singleton3.class.getClassLoader().getResourceAsStream("config.properties"));
			INSTANCE=new Singleton3(properties.getProperty("name"));
			System.out.println(properties.getProperty("name"));
			System.out.println("初始化完成");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//构造方法私有化
	private Singleton3(String name) {
		this.name=name;
	}
}
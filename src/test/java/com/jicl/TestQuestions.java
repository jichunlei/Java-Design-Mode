package com.jicl;

import org.junit.Test;
import com.jicl.design.singleton.Singleton1;

public class TestQuestions {
	@Test
	public void testSingleton1() {
		System.out.println("Singleton1:"+Singleton1.getInstance());
		System.out.println("Singleton1:"+Singleton1.getInstance());
	}
}

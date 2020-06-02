package com.jicl.design.singleton;

import org.junit.Test;

public class TestQuestions {
    @Test
    public void testSingleton1() {
        System.out.println("Singleton1:" + Singleton1.getInstance());
        System.out.println("Singleton1:" + Singleton1.getInstance());
    }
}

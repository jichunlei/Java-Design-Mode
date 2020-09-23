package com.jicl.design.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/22 19:19
 */
public class UidGenerator {
    /**
     * 唯一序列
     */
    private AtomicInteger uniqueSequence = new AtomicInteger(0);

    /**
     * 单例
     */
    private static UidGenerator uidGenerator = new UidGenerator();

    //构造方法私有化，禁止被外部实例化
    private UidGenerator() {
    }

    /**
     * 获取实例
     *
     * @return com.jicl.design.singleton.UidGenerator
     * @author xianzilei
     * @date 2020/9/22 19:26
     **/
    public static UidGenerator getInstance() {
        return uidGenerator;
    }

    /**
     * 生成唯一序列
     *
     * @return int
     * @author xianzilei
     * @date 2020/9/22 19:26
     **/
    public int getNextId() {
        return uniqueSequence.incrementAndGet();
    }
}

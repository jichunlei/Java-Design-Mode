package com.jicl.design.command.basic;

/**
 * 业务真正执行者
 *
 * @author : xianzilei
 * @date : 2020/9/10 9:22
 */
public interface MainBoardReceiver {
    /**
     * 开机
     *
     * @return void
     * @author xianzilei
     * @date 2020/10/30 18:58
     **/
    void open();

    /**
     * 关机
     *
     * @return void
     * @author xianzilei
     * @date 2020/10/30 18:58
     **/
    void shutdown();

    /**
     * 重启
     *
     * @return void
     * @author xianzilei
     * @date 2020/10/30 18:58
     **/
    void reset();
}

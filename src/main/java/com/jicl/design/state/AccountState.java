package com.jicl.design.state;

/**
 * 账户状态
 *
 * @author : xianzilei
 * @date : 2020/11/3 15:38
 */
public abstract class AccountState {

    /**
     * 账户状态描述
     */
    protected String desc;

    /**
     * 账户
     */
    protected Account account;

    /**
     * 存款
     *
     * @param money 1
     * @return void
     * @author xianzilei
     * @date 2020/11/3 15:54
     **/
    public abstract void deposit(double money);

    /**
     * 取款
     *
     * @param money 1
     * @return void
     * @author xianzilei
     * @date 2020/11/3 15:54
     **/
    public abstract void withdraw(double money);

    /**
     * 状态转换
     *
     * @return void
     * @author xianzilei
     * @date 2020/11/3 15:56
     **/
    public abstract void changeState();
}

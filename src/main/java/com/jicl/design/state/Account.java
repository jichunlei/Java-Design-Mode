package com.jicl.design.state;

/**
 * 账户
 *
 * @author : xianzilei
 * @date : 2020/11/3 15:48
 */
public class Account {

    /**
     * 维持一个对抽象状态对象的引用
     */
    private AccountState state;
    /**
     * 开户名
     */
    private String owner;
    /**
     * 账户余额
     */
    private double amount = 0;


    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(String owner) {
        this.owner = owner;
        this.state = new NormalAccountState(this);
    }

    /**
     * 存款
     *
     * @param money 1
     * @return void
     * @author xianzilei
     * @date 2020/11/3 18:14
     **/
    public void deposit(double money) {
        System.out.println(owner + "存款" + money);
        state.deposit(money);
        System.out.println("当前余额为" + amount + "现在帐户状态为" + state.desc);
        System.out.println("--------------------------------------------------------");
    }

    /**
     * 取款
     *
     * @param money 1
     * @return void
     * @author xianzilei
     * @date 2020/11/3 18:14
     **/
    public void withdraw(double money) {
        System.out.println(owner + "取款" + money);
        state.withdraw(money);
        System.out.println("当前余额为" + amount + "现在帐户状态为" + state.desc);
        System.out.println("--------------------------------------------------------");
    }
}

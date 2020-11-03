package com.jicl.design.state;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/11/3 18:10
 */
public class Client {

    public static void main(String[] args) {
        //创建账户
        Account account = new Account("张三");
        //存款5000
        account.deposit(5000);

        //分别取款6000、5000、5000
        account.withdraw(6000);
        account.withdraw(5000);
        account.withdraw(5000);

        //存款10000
        account.deposit(10000);
    }

}

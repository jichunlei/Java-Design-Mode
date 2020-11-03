package com.jicl.design.state;

/**
 * 受限状态
 *
 * @author : xianzilei
 * @date : 2020/11/3 17:38
 */
public class RestrictedAccountState extends AccountState {

    public RestrictedAccountState(Account account) {
        super.desc = "受限";
        super.account = account;
    }

    @Override
    public void deposit(double money) {
        account.setAmount(account.getAmount() + money);
        changeState();
    }

    @Override
    public void withdraw(double money) {
        System.out.println("账户处于受限状态，无法取款！");
    }

    @Override
    public void changeState() {
        double amount = account.getAmount();
        //账户余额为[0,正无穷)之间，需要转移状态为正常状态
        if (amount >= 0) {
            account.setState(new NormalAccountState(account));
        }
        //账户余额为(-5000,0)之间，需要转移状态为透支状态
        else if (amount < 0 && amount > -5000) {
            account.setState(new OverdraftAccountState(account));
        }
    }
}

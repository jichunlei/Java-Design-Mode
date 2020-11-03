package com.jicl.design.state;

/**
 * 正常状态
 *
 * @author : xianzilei
 * @date : 2020/11/3 15:57
 */
public class NormalAccountState extends AccountState {

    public NormalAccountState(Account account) {
        desc = "正常";
        super.account = account;
    }

    @Override
    public void deposit(double money) {
        account.setAmount(account.getAmount() + money);
        changeState();
    }

    @Override
    public void withdraw(double money) {
        account.setAmount(account.getAmount() - money);
        changeState();
    }

    @Override
    public void changeState() {
        double amount = account.getAmount();
        //账户余额为(-5000,0)之间，需要转移状态为透支状态
        if (amount < 0 && amount > -5000) {
            account.setState(new OverdraftAccountState(account));
        }
        //账户余额为(负无穷,-5000]之间，需要转移状态为受限状态
        else if (amount <= -5000) {
            account.setState(new RestrictedAccountState(account));
        }
    }
}

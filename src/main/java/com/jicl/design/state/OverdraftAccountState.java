package com.jicl.design.state;

/**
 * 透支状态
 *
 * @author : xianzilei
 * @date : 2020/11/3 17:35
 */
public class OverdraftAccountState extends AccountState {

    public OverdraftAccountState(Account account) {
        super.desc = "透支";
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
        //账户余额为[0,正无穷)之间，需要转移状态为正常状态
        if (amount > 0) {
            account.setState(new NormalAccountState(account));
        }
        //账户余额为(负无穷,-5000]之间，需要转移状态为受限状态
        else if (amount <= -5000) {
            account.setState(new RestrictedAccountState(account));
        }
    }
}

package oop.oopexer5;

/**
 * 在提款方法withdraw()中,需要判断用户余额是否能够满足提款数额的要求,如果不能,
 * 应给出提示.deposit()方法表示存款.
 */
public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * 存钱操作
     * @param amt
     */
    public void deposit(double amt){
        if (amt>0){
            balance+=amt;
            System.out.println("存钱成功");
        }

    }

    /**
     * 取钱操作
     * @param amt
     */
    public void withdraw(double amt){
        if (amt>balance){
            System.out.println("余额不足");
            return;
        }
        balance-=amt;
        System.out.println("取钱成功");
    }
}

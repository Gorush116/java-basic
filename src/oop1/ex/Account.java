package oop1.ex;

public class Account {

    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 후 잔액 : " + balance);
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금 후 잔액 : " + balance);
        } else {
            System.out.println("출금할 잔액이 부족합니다. 현재 잔액 : " + balance);
        }
    }

}

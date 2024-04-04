package com.learning.core.day2session1;

class BankAccount {
    @SuppressWarnings("unused")
	private int accNo;
    @SuppressWarnings("unused")
	private String custName;
    @SuppressWarnings("unused")
	private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = initialBalance;
    }

    public void deposit(float amt) {
        if (amt < 0) {
            System.out.println("Error: Cannot deposit negative amount.");
            return;
        }
        balance += amt;
    }

    public float getBalance() {
        return balance;
    }
}

public class D02P06_1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(123, "John", "Saving", -900);
        acc1.deposit(-900); 
    }
}

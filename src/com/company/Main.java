package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdraw(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdraw(100.00);
    }
}

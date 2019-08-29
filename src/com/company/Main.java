package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "email@bob.com", "(123) 456-7890");

        System.out.println(bobsAccount.getAccountNumber());

        bobsAccount.withdraw(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdraw(100.00);
    }
}

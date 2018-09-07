package com.kgp.banking.model;

import java.math.BigInteger;

public abstract class SimpleAccount {
    private static int counter = 0;
    private double id;
    private String firstName;
    private String lastName;
    private BigInteger balance;

    public double getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void changeBalance(BigInteger balance) {
        this.balance.add(balance);
    }

    public SimpleAccount(String firstName, String lastName) {
        this.id=counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance=BigInteger.valueOf(0);
    }
}

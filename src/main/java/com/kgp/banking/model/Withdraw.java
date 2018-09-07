package com.kgp.banking.model;

import java.math.BigInteger;
import java.util.Date;

public class Withdraw extends SimpleTransaction {
    private SimpleCustomer customer;

    public Withdraw(Date transactionDate, BigInteger amount) {
        super(transactionDate, amount);
    }


}

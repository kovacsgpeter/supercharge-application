package com.kgp.banking.model;

import java.math.BigInteger;
import java.util.Date;

public abstract class SimpleTransaction {
    private static int counter = 0;
    private double id;
    private Date transactionDate;
    private BigInteger amount;

    public SimpleTransaction(Date transactionDate, BigInteger amount) {
        this.id = counter++;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }
}

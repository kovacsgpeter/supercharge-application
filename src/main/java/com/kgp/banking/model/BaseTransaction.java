package com.kgp.banking.model;

import java.math.BigInteger;
import java.util.Date;

public abstract class BaseTransaction {
    private static int counter = 0;
    private double id;
    private Date transactionDate;
    private BigInteger amount;
    private TransactionType transactionType;

    public BaseTransaction(Date transactionDate, BigInteger amount, TransactionType transactionType) {
        this.id = counter++;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.transactionType = transactionType;
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

    @Override
    public String toString() {
        return this.transactionType + " " + transactionDate + " " + this.amount;
    }
}

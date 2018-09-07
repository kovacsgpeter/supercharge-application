package com.kgp.banking.model;

import java.math.BigInteger;
import java.util.Date;

public class B2CTransaction extends BaseTransaction {
    private SimpleAccount customer;

    public B2CTransaction(Date transactionDate, BigInteger amount, SimpleAccount customer, TransactionType transactionType) {
        super(transactionDate, amount, transactionType);
        this.customer= customer;
    }

    public SimpleAccount getCustomer() {
        return customer;
    }

    public void setCustomer(SimpleAccount customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return super.toString() + " "+this.customer.getBalance();
    }
}

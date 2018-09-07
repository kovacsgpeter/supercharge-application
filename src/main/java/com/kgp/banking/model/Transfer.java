package com.kgp.banking.model;

import java.math.BigInteger;
import java.util.Date;

public class Transfer extends SimpleTransaction {
    private SimpleCustomer sender;
    private SimpleCustomer reciever;

    public Transfer(SimpleCustomer sender, SimpleCustomer reciever, Date transactionDate, BigInteger amount) {
        super(transactionDate, amount);
        this.sender=sender;
        this.reciever=reciever;
    }

    public SimpleCustomer getSender() {
        return sender;
    }

    public void setSender(SimpleCustomer sender) {
        this.sender = sender;
    }

    public SimpleCustomer getReciever() {
        return reciever;
    }

    public void setReciever(SimpleCustomer reciever) {
        this.reciever = reciever;
    }
}

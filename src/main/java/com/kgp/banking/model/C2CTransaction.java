package com.kgp.banking.model;

import java.math.BigInteger;
import java.util.Date;

public class C2CTransaction extends BaseTransaction {
    private SimpleAccount sender;
    private SimpleAccount reciever;

    public C2CTransaction(Date transactionDate, BigInteger amount, TransactionType transactionType) {
        super(transactionDate, amount, transactionType);
        this.sender=sender;
        this.reciever=reciever;
    }


    public SimpleAccount getSender() {
        return sender;
    }

    public void setSender(SimpleAccount sender) {
        this.sender = sender;
    }

    public SimpleAccount getReciever() {
        return reciever;
    }

    public void setReciever(SimpleAccount reciever) {
        this.reciever = reciever;
    }
}

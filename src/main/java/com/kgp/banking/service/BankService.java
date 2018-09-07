package com.kgp.banking.service;

import com.kgp.banking.dao.CustomerDao;
import com.kgp.banking.dao.TransactionDao;
import com.kgp.banking.model.SimpleCustomer;

public class BankService implements ISimpleService {

    CustomerDao customerDao;
    TransactionDao transactionDao;


    @Override
    public boolean transfer(SimpleCustomer sender, SimpleCustomer receiver) {
        return false;
    }

    @Override
    public boolean withdraw(SimpleCustomer customer) {
        return false;
    }
}

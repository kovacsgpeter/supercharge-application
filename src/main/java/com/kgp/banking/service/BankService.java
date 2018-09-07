package com.kgp.banking.service;

import com.kgp.banking.dao.AccountDao;
import com.kgp.banking.dao.TransactionDao;
import com.kgp.banking.model.B2CTransaction;
import com.kgp.banking.model.BaseTransaction;
import com.kgp.banking.model.SimpleAccount;
import com.kgp.banking.model.TransactionType;

import java.math.BigInteger;
import java.util.Date;

public class BankService extends BaseService implements TransferService {

    @Override
    public boolean transfer(SimpleAccount sender, SimpleAccount receiver) {
        return false;
    }

    @Override
    public boolean withdraw(SimpleAccount customer, BigInteger amount) {
        BaseTransaction withdraw = new B2CTransaction(new Date(), amount, customer, TransactionType.WITHDRAW);
        super.transactionDao.save(withdraw);
        customer.changeBalance(amount);
        super.accountDao.update(customer);

        return true; //Todo: ACID

    }

    @Override
    public boolean deposit(SimpleAccount customer, BigInteger amount) {
        BaseTransaction deposit = new B2CTransaction(new Date(), amount, customer, TransactionType.DEPOSIT);
        super.transactionDao.save(deposit);
        customer.changeBalance(amount);
        super.accountDao.update(customer);

        return true; //Todo: ACID


    }

    public BankService(AccountDao accountDao, TransactionDao transactionDao) {
        this.accountDao = accountDao;
        this.transactionDao = transactionDao;
    }
}

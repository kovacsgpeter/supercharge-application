package com.kgp.banking.service;

import com.kgp.banking.dao.AccountDao;
import com.kgp.banking.dao.TransactionDao;

public abstract class BaseService implements ISimpleService {
    AccountDao accountDao;
    TransactionDao transactionDao;

    BaseService(AccountDao accountDao, TransactionDao transactionDao) {
        this.accountDao = accountDao;
        this.transactionDao = transactionDao;
    }
}

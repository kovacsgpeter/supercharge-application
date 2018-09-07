package com.kgp.banking.dao;


import com.kgp.banking.model.BaseTransaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionDaoMem implements TransactionDao {

    private List<BaseTransaction> transactions;

    @Override
    public BaseTransaction get(long id) {
        for (BaseTransaction transaction : transactions) {
            if (transaction.getId()==id){
                return transaction;
            }
        }
        return null;
    }

    @Override
    public List<BaseTransaction> getAll() {

        return transactions;
    }

    @Override
    public void save(BaseTransaction t) {
        transactions.add(t);
    }

    @Override
    public void update(BaseTransaction t) {
        for (BaseTransaction transaction : transactions) {
            if (transaction.getId() == t.getId()) {
                transaction = t;
            }
        }
    }

    @Override
    public void delete(BaseTransaction t) {
        transactions.remove(t);
    }

    public TransactionDaoMem() {
        this.transactions = new ArrayList<BaseTransaction>();
    }
}

package com.kgp.banking.dao;


import com.kgp.banking.model.SimpleTransaction;

import java.util.List;

public class TransactionDaoMem implements TransactionDao {

    private List<SimpleTransaction> transactions;

    @Override
    public SimpleTransaction get(long id) {
        for (SimpleTransaction transaction : transactions) {
            if (transaction.getId()==id){
                return transaction;
            }
        }
        return null;
    }

    @Override
    public List<SimpleTransaction> getAll() {

        return transactions;
    }

    @Override
    public void save(SimpleTransaction t) {
        transactions.add(t);
    }

    @Override
    public void update(SimpleTransaction t) {
        for (SimpleTransaction transaction : transactions) {
            if (transaction.getId() == t.getId()) {
                transaction = t;
            }
        }
    }

    @Override
    public void delete(SimpleTransaction t) {
        transactions.remove(t);
    }
}

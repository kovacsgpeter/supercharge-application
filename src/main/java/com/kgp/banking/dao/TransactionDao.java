package com.kgp.banking.dao;

import com.kgp.banking.model.BaseTransaction;

import java.util.List;

public interface TransactionDao {

    BaseTransaction get(long id);

    List<BaseTransaction> getAll();

    void save(BaseTransaction t);

    void update(BaseTransaction t);

    void delete(BaseTransaction t);

}

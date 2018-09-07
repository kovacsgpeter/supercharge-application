package com.kgp.banking.dao;

import com.kgp.banking.model.SimpleTransaction;

import java.util.List;

public interface TransactionDao {

    SimpleTransaction get(long id);

    List<SimpleTransaction> getAll();

    void save(SimpleTransaction t);

    void update(SimpleTransaction t);

    void delete(SimpleTransaction t);

}

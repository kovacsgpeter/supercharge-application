package com.kgp.banking.dao;

import com.kgp.banking.model.SimpleAccount;

import java.util.List;

public interface AccountDao {

    SimpleAccount get(long id);

    List<SimpleAccount> getAll();

    void save(SimpleAccount c);

    void update(SimpleAccount c);

    void delete(SimpleAccount c);

}

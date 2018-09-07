package com.kgp.banking.dao;

import com.kgp.banking.model.SimpleCustomer;
import com.kgp.banking.model.SimpleTransaction;

import java.util.List;

public interface CustomerDao {

    SimpleCustomer get(long id);

    List<SimpleCustomer> getAll();

    void save(SimpleCustomer c);

    void update(SimpleCustomer c);

    void delete(SimpleCustomer c);

}

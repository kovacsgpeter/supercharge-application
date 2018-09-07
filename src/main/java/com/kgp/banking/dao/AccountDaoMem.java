package com.kgp.banking.dao;

import com.kgp.banking.model.SimpleAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountDaoMem implements AccountDao {

    private List<SimpleAccount> customers;

    @Override
    public SimpleAccount get(long id) {
        for (SimpleAccount customer : customers) {
            if (customer.getId()==id){
                return customer;
            }
        }
        return null; //Todo: Null pattern?
    }

    @Override
    public List<SimpleAccount> getAll() {
        return customers;
    }

    @Override
    public void save(SimpleAccount c) {
        this.customers.add(c);
    }

    @Override
    public void update(SimpleAccount c) {
        for (SimpleAccount customer : customers) {
            if (customer.getId()==c.getId()){
                customer=c;
            }

            }
    }

    @Override
    public void delete(SimpleAccount c) {
        for (SimpleAccount customer : customers) {
            if (customer.getId() == c.getId()) {
                customers.remove(c);
            }
        }
    }

    public AccountDaoMem() {
        this.customers=new ArrayList<SimpleAccount>();
    }
}

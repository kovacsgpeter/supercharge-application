package com.kgp.banking.dao;

import com.kgp.banking.model.Customer;
import com.kgp.banking.model.SimpleCustomer;

import java.util.List;

public class CustomerDaoMem implements CustomerDao {

    private List<SimpleCustomer> customers;

    @Override
    public SimpleCustomer get(long id) {
        for (SimpleCustomer customer : customers) {
            if (customer.getId()==id){
                return customer;
            }
        }
        return null; //Todo: Null pattern?
    }

    @Override
    public List<SimpleCustomer> getAll() {
        return customers;
    }

    @Override
    public void save(SimpleCustomer c) {
        this.customers.add(c);
    }

    @Override
    public void update(SimpleCustomer c) {
        for (SimpleCustomer customer : customers) {
            if (customer.getId()==c.getId()){
                if (!customer.getFirstName().equals(c.getFirstName())){
                    customer.setFirstName(c.getFirstName());
                }
                if(!customer.getLastName().equals(c.getLastName())){
                    customer.setLastName(c.getFirstName());
                }
            }

            }
    }

    @Override
    public void delete(SimpleCustomer c) {
        for (SimpleCustomer customer : customers) {
            if (customer.getId() == c.getId()) {
                customers.remove(c);
            }
        }
    }
}

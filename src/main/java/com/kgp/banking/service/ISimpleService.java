package com.kgp.banking.service;

import com.kgp.banking.model.SimpleCustomer;

public interface ISimpleService {

    boolean transfer(SimpleCustomer sender, SimpleCustomer receiver);
    boolean withdraw(SimpleCustomer customer);


}

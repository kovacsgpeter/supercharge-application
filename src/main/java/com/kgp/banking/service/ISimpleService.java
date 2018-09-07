package com.kgp.banking.service;

import com.kgp.banking.model.SimpleAccount;

import java.math.BigInteger;

public interface ISimpleService {

    boolean withdraw(SimpleAccount customer, BigInteger amount);
    boolean deposit(SimpleAccount customer, BigInteger amount);


}

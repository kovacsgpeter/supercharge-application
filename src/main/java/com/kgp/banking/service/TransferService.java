package com.kgp.banking.service;

import com.kgp.banking.model.SimpleAccount;

import java.math.BigInteger;

public interface TransferService {

    boolean transfer(SimpleAccount sender, SimpleAccount receiver, BigInteger amount);

}

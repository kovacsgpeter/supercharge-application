package com.kgp.banking.service;

import com.kgp.banking.model.SimpleAccount;

public interface TransferService {

    boolean transfer(SimpleAccount sender, SimpleAccount receiver);

}

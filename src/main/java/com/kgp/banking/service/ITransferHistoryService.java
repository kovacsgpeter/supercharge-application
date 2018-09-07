package com.kgp.banking.service;

import com.kgp.banking.model.BaseTransaction;
import com.kgp.banking.model.SimpleAccount;

import java.util.List;

public interface ITransferHistoryService {

    public List<BaseTransaction> getTransferHistroy(SimpleAccount account);
}

package com.kgp.banking.service;

import com.kgp.banking.model.BaseTransaction;

import java.util.List;

public interface ITransferHistoryService {

    public List<BaseTransaction> getTransferHistroy();
}

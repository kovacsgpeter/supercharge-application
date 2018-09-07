package com.kgp.banking.service;

import com.kgp.banking.model.BaseTransaction;
import com.kgp.banking.model.SimpleAccount;

import java.util.List;

public interface ITransferHistoryService {

    List<BaseTransaction> getTransferHistroy(SimpleAccount account);

    List<BaseTransaction> getDepositHistory(SimpleAccount account);

    List<BaseTransaction> getWithdrawalHistory(SimpleAccount account);


}

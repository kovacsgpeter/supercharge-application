package com.kgp.banking.service;

import com.kgp.banking.model.BaseTransaction;
import com.kgp.banking.model.SimpleAccount;

import java.util.Date;
import java.util.List;

public interface ITransferHistoryService {

    List<BaseTransaction> getTransferHistroy(SimpleAccount account);

    List<BaseTransaction> getDepositHistory(SimpleAccount account);

    List<BaseTransaction> getWithdrawalHistory(SimpleAccount account);

    List<BaseTransaction> getHistorybyDate(SimpleAccount account, Date date);

}

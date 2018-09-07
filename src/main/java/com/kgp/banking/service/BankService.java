package com.kgp.banking.service;

import com.kgp.banking.dao.AccountDao;
import com.kgp.banking.dao.TransactionDao;
import com.kgp.banking.model.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankService extends BaseService implements TransferService, ITransferHistoryService {

    @Override
    public boolean transfer(SimpleAccount sender, SimpleAccount receiver, BigInteger amount) {
        BaseTransaction transfer = new C2CTransaction(new Date(), amount, TransactionType.TRANSFER, sender, receiver);
        super.transactionDao.save(transfer);
        sender.changeBalance(amount.negate());
        receiver.changeBalance(amount);
        super.accountDao.update(sender);
        super.accountDao.update(receiver);
        return true;
    }

    @Override
    public boolean withdraw(SimpleAccount customer, BigInteger amount) {
        BaseTransaction withdraw = new B2CTransaction(new Date(), amount, customer, TransactionType.WITHDRAW);
        super.transactionDao.save(withdraw);
        customer.changeBalance(amount.negate());
        super.accountDao.update(customer);

        return true; //Todo: ACID

    }

    @Override
    public boolean deposit(SimpleAccount customer, BigInteger amount) {
        BaseTransaction deposit = new B2CTransaction(new Date(), amount, customer, TransactionType.DEPOSIT);
        super.transactionDao.save(deposit);
        customer.changeBalance(amount);
        super.accountDao.update(customer);

        return true; //Todo: ACID
    }

    public BankService(AccountDao accountDao, TransactionDao transactionDao) {
        super(accountDao, transactionDao);
    }

    @Override
    public List<BaseTransaction> getTransferHistroy(SimpleAccount account) {
        List<BaseTransaction> resultSet = new ArrayList<>();
        for (BaseTransaction transaction : super.transactionDao.getAll()) {
            if(transaction.getClass()== C2CTransaction.class){
               if( ((C2CTransaction) transaction).getReciever().getId()==account.getId());
               resultSet.add(transaction);
            }
            if(transaction.getClass()== B2CTransaction.class){
                if( ((B2CTransaction) transaction).getCustomer().getId()==account.getId()){
                    resultSet.add(transaction);
                }
            }
        }
        return resultSet;
    }

    @Override
    public List<BaseTransaction> getDepositHistory(SimpleAccount account) {
        List<BaseTransaction> resultSet = new ArrayList<>();

        for (BaseTransaction transaction : super.transactionDao.getAll()) {
            if( (transaction).getTransactionType()==TransactionType.DEPOSIT){
                if( ((B2CTransaction) transaction).getCustomer().getId()==account.getId()){
                    resultSet.add(transaction);
                }
            }
        }
        return resultSet;
    }

    @Override
    public List<BaseTransaction> getWithdrawalHistory(SimpleAccount account) {
        List<BaseTransaction> resultSet = new ArrayList<>();

        for (BaseTransaction transaction : super.transactionDao.getAll()) {
            if( (transaction).getTransactionType()==TransactionType.WITHDRAW){
                if( ((B2CTransaction) transaction).getCustomer().getId()==account.getId()){
                        resultSet.add(transaction);
                    }
                }
            }
        return resultSet;
    }

    @Override
    public List<BaseTransaction> getHistorybyDate(SimpleAccount account, Date date) {

        List<BaseTransaction> resultSet = new ArrayList<>();
        for (BaseTransaction transaction : super.transactionDao.getAll()) {
            if(transaction.getTransactionDate().compareTo(date)>1){
                resultSet.add(transaction);
            }
        }
        return resultSet; //Todo: compare today date to argument date
    }
}

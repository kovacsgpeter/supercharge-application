package com.kgp.banking;

import com.kgp.banking.dao.AccountDaoMem;
import com.kgp.banking.dao.TransactionDaoMem;
import com.kgp.banking.model.Account;
import com.kgp.banking.model.SimpleAccount;
import com.kgp.banking.service.BankService;
import com.kgp.banking.service.BaseService;
import com.kgp.banking.service.Printer;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();

        SimpleAccount acc1 = new Account("Peter", "Kovacs");
        SimpleAccount acc2 = new Account("Gellert", "Kovacs");

        BankService bs1 = new BankService(new AccountDaoMem(), new TransactionDaoMem());
        bs1.deposit(acc1, BigInteger.valueOf(500));
        bs1.deposit(acc2, BigInteger.valueOf(1000));
        bs1.transfer(acc2, acc1, BigInteger.valueOf(300));

        printer.printAllDetail( bs1.getTransferHistroy(acc1));


    }
}

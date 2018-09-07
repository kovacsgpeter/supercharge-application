package com.kgp.banking.model;

import java.math.BigInteger;
import java.util.Date;

public abstract class SimpleTransaction {
    Date transactionDate;
    BigInteger amount;
    BigInteger balance;

}

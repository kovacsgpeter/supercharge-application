package com.kgp.banking.service;

import com.kgp.banking.model.BaseTransaction;

import java.util.List;

public class Printer {


    public void printAllDetail(List<BaseTransaction> items){
        for (BaseTransaction item : items) {
            System.out.println(item.toString());
        }
    }
}

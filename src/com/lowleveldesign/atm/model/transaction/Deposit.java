package com.lowleveldesign.atm.model.transaction;

public abstract class Deposit extends Transaction{
    private int accountId;
    public double getAccountId(){
        return -1;
    }
}

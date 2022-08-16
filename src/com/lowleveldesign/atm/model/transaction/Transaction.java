package com.lowleveldesign.atm.model.transaction;

import com.lowleveldesign.atm.model.enums.TransactionStatus;

import java.util.Date;

public abstract class Transaction {
    private int transactionId;
    private Date transactionDate;

    private TransactionStatus transactionStatus;

    public boolean makeTransaction(){
        return false;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}

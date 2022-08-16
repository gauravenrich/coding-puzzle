package com.lowleveldesign.atm.service;

import com.lowleveldesign.atm.model.Card;
import com.lowleveldesign.atm.model.Customer;
import com.lowleveldesign.atm.model.transaction.TransactionDetail;
import com.lowleveldesign.atm.model.transaction.TransactionInfo;

public interface BankService {
    boolean isValidUser(String pin, Card cardInfo);
    Customer getCustomerDetails(Card cardInfo);
    TransactionDetail executeTransaction(TransactionInfo transactionInfo, Customer customer);
}

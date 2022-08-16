package com.lowleveldesign.atm.model;

import com.lowleveldesign.atm.model.enums.CustomerStatus;
import com.lowleveldesign.atm.service.BankService;

public class Customer {
    private String firstName;
    private String secondName;
    private String accountNumber;
    private String phone;
    private Address address;
    private CustomerStatus customerStatus;
    private Account account;
    private Card card;
    private BankService bankService;
}

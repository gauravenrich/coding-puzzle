package com.lowleveldesign.atm.model;

public class ATM {
    private int atmId;
    private Address location;
    private CashDispenser cashDispenser;
    private KeyPad keyPad;
    private Screen screen;
    private CashDeposit cashDeposit;
    private ChequeDeposit chequeDeposit;

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }

    public void setCashDispenser(CashDispenser cashDispenser) {
        this.cashDispenser = cashDispenser;
    }

    public KeyPad getKeyPad() {
        return keyPad;
    }

    public void setKeyPad(KeyPad keyPad) {
        this.keyPad = keyPad;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public CashDeposit getCashDeposit() {
        return cashDeposit;
    }

    public void setCashDeposit(CashDeposit cashDeposit) {
        this.cashDeposit = cashDeposit;
    }

    public ChequeDeposit getChequeDeposit() {
        return chequeDeposit;
    }

    public void setChequeDeposit(ChequeDeposit chequeDeposit) {
        this.chequeDeposit = chequeDeposit;
    }

}

package com.tosan.transaction.model;

public enum TransactionType {
    WITHDRAWAL, PAID, TRANSFER;

    public TransactionType getWithdrawal() {
        return TransactionType.WITHDRAWAL;
    }

    public TransactionType getPaid() {
        return TransactionType.PAID;
    }

    public TransactionType getTransfer() {
        return TransactionType.TRANSFER;
    }
}

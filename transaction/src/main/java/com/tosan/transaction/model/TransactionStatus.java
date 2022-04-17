package com.tosan.transaction.model;

public enum TransactionStatus {

    SUCCESSFUL, FAILED;

    public TransactionStatus getSuccessful() {
        return TransactionStatus.SUCCESSFUL;
    }

    public TransactionStatus getFailed() {
        return TransactionStatus.FAILED;
    }
}

package com.tosan.deposit.model;

public enum DepositStatus {
    OPEN, CLOSE, BLOCKED_WITHDRAWALS, FREEZING;

    private DepositStatus getOpen() {
        return DepositStatus.OPEN;
    }

    private DepositStatus getClose() {
        return DepositStatus.CLOSE;
    }

    private DepositStatus getBlockedWithdrawals() {
        return DepositStatus.BLOCKED_WITHDRAWALS;
    }

    private DepositStatus getFreezing() {
        return DepositStatus.FREEZING;
    }
}

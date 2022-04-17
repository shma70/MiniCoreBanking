package com.tosan.deposit.model;

public enum DepositType {
    LONG_TERM, SHORT_TERM, GHARZ_CURRENT, GHARZ_SAVINGS;

    private DepositType getLongTerm() {
        return DepositType.LONG_TERM;
    }

    private DepositType getShortTerm() {
        return DepositType.SHORT_TERM;
    }

    private DepositType getGharzCurrent() {
        return DepositType.GHARZ_CURRENT;
    }

    private DepositType getGharzSavings() {
        return DepositType.GHARZ_SAVINGS;
    }
}

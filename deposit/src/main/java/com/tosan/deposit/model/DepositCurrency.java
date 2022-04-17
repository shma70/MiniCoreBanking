package com.tosan.deposit.model;

import java.util.Objects;

public enum DepositCurrency {
    RIALS, DOLLARS;

    private DepositCurrency getRials() {
        return DepositCurrency.RIALS;
    }

    private DepositCurrency getDollar() {
        return DepositCurrency.DOLLARS;
    }

//    public String getDepositCurrency() {
//        if (Objects.equals(getDepositCurrency(), "Dollars")) {
//            System.out.println(getBalance() / 280000 + " Dollars");
//        } else {
//            System.out.println(getBalance() + " Rials");
//        }
//        return super.getDepositCurrency();
//
//    }

}


package com.tosan.customer.model;


public enum CustomerType {
    REAL, LEGAL;

    private CustomerType getCustomerType() {
        if (getCustomerType().equals(CustomerType.REAL)) {
            return CustomerType.REAL;
        } else {
            return CustomerType.LEGAL;
        }
    }
}


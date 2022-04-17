package com.tosan.customer.model;


public enum CustomerStatus {
    ACTIVE, INACTIVE;

    private CustomerStatus getStatus() {
        if (getStatus().equals(CustomerStatus.ACTIVE)) {
            return CustomerStatus.ACTIVE;
        } else {
            return CustomerStatus.INACTIVE;
        }
    }

}

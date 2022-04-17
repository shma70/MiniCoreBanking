package com.tosan.leon.model;

public enum LeonType {
    MARRIAGE,MORTGAGE,PURCHASE;
    public LeonType getMarriage(){
        return LeonType.MARRIAGE;
    }
    public LeonType getMortgage(){
        return LeonType.MORTGAGE;
    }
    public LeonType getPurchase(){
        return LeonType.PURCHASE;
    }
}

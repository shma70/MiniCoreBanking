package com.tosan.leon.model;

public enum LeonStatus {
    OPEN,PAYING,CLOSE;
    public LeonStatus getOpen(){
        return LeonStatus.OPEN;
    }
    public LeonStatus getPaying(){
        return LeonStatus.PAYING;
    }
    public LeonStatus getClose(){
        return LeonStatus.CLOSE;
    }
}

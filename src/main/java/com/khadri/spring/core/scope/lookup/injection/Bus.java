package com.khadri.spring.core.scope.lookup.injection;

public class Bus {

    Passenger passenger;
    LookUpManager lookUpManager;

    public LookUpManager getLookUpManager() {
        return lookUpManager;
    }

    public void setLookUpManager(LookUpManager lookUpManager) {
        this.lookUpManager = lookUpManager;
    }

    public Passenger getPassenger() {
        return this.lookUpManager.createProtoTypeBean();
    }
}

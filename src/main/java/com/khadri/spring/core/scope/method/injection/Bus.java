package com.khadri.spring.core.scope.method.injection;

public class Bus {

    Passenger passenger;
    public Passenger getPassenger() {
        return this.passenger.createProtoTypePassenger();
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}

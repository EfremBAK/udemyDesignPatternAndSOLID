package com.coffeepoweredcrew.state;

public class Cancelled implements OrderState{

    public double handleCancellation() {
       throw new IllegalStateException("Cancelled order. Cant cancel anymore.");
    }
}

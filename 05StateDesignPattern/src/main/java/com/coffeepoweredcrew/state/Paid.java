package com.coffeepoweredcrew.state;

public class Paid implements OrderState{

    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transactions");
        return 10;
    }
}

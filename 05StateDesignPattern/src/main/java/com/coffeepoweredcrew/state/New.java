package com.coffeepoweredcrew.state;

public class New implements OrderState{

    public double handleCancellation() {
        System.out.println("It is a new Order. No processing done");
        return 0;
    }
}

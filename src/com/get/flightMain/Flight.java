package com.get.flightMain;

public class Flight {
    int seats = 50;
    int passengers = 0;
    int bags =0;
    int carryOns =0;
    public void add1Passenger(){
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }
    public void add1Passenger(int bags){
        this.bags = bags;

        System.out.println("Bags checked in :" + this.bags);

    }
    public void add1Passenger(int bags, int carryOns){
        this.bags = bags;
        this.carryOns = carryOns;
        System.out.println("Bags checked in :" + this.bags);

    }

    private boolean hasSeating(){
        return passengers < seats;
    }
    private void handleTooMany(){
        System.out.println ("Too many passengers. No seats available");
    }


}

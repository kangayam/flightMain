package com.get.flightMain;

public class Main {

    public static void main(String[] args) {
	System.out.println("Inside the flight main class");
	Flight United = new Flight();
	United.add1Passenger();
	United.add1Passenger(2,2);
    }
}

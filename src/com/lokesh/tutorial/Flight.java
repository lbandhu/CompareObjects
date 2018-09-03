package com.lokesh.tutorial;

public class Flight {

    int flightNumber;

    int seatsAvailable;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Flight))
            return false;
        //Cast obj into Flight
        Flight fl = (Flight) o;

        if(this.flightNumber == fl.getFlightNumber() && this.seatsAvailable == fl.getSeatsAvailable()){
            return true;
        }

        return false;
    }

}

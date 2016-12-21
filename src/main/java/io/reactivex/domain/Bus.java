/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.domain;

import rx.subjects.ReplaySubject;

/**
 *
 * @author Matthias
 */
public class Bus {
    private int id;
    private BusLine busLine;
    private BusStop currentBusStop;
    private BusStop endDestination;
    
    public ReplaySubject<Passenger> passengers = ReplaySubject.create(); 

    public Bus(int id, BusLine busLine) {
        this.id = id;
        this.busLine = busLine;
        passengers.subscribe(v -> System.out.println("(Passenger " + v.getId() + ") entered Bus " + id 
                + " | balance: " + v.getBalance()));
    }

    public BusLine getBusLine() {
        return busLine;
    }

    public void setBusLine(BusLine busLine) {
        this.busLine = busLine;
    }

    public BusStop getCurrentBusStop() {
        return currentBusStop;
    }

    public void setCurrentBusStop(BusStop currentBusStop) {
        this.currentBusStop = currentBusStop;
    }

    public BusStop getEndDestination() {
        return endDestination;
    }

    public void setEndDestination(BusStop endDestination) {
        this.endDestination = endDestination;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "(Bus " + id + ") currentBusStop = " + currentBusStop.getNaam() 
                + ". endDestination = " + endDestination.getNaam() + ".";
    }
    
    
}

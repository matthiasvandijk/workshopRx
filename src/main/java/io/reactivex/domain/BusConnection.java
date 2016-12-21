/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.domain;

/**
 *
 * @author Matthias
 */
public class BusConnection {
    private BusStop start;
    private BusStop end;
    private double rate;
    private double distance;

    public BusConnection(BusStop start, BusStop end, double rate, double distance) {
        this.start = start;
        this.end = end;
        this.rate = rate;
        this.distance = distance;
    }

    public BusStop getStart() {
        return start;
    }

    public BusStop getEnd() {
        return end;
    }

    public double getRate() {
        return rate;
    }

    public double getDistance() {
        return distance;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.domain;

import java.util.ArrayList;

/**
 *
 * @author Matthias
 */
public class BusLine {
    private int busLine;
    private ArrayList<BusConnection> busConnections = new ArrayList();

    public BusLine(int busLine) {
        this.busLine = busLine;
    }
    
    public void addConnction(BusConnection busConnection) {
        busConnections.add(busConnection);
    }
    
    public BusStop getStartPoint() {
        return busConnections.get(0).getStart();
    }
    
    public BusStop getEndPoint() {
        return busConnections.get(busConnections.size() - 1).getEnd();
    }
    
    public BusStop reverseEndDestination(BusStop currentEndDestionation) {
        if (currentEndDestionation.equals(this.getEndPoint())) {
            return this.getStartPoint();
        } else if (currentEndDestionation.equals(this.getStartPoint())) {
            return this.getEndPoint();
        }
        
        return null;
    }
    
    public BusStop getNextBusStop(BusStop currentBusStop, BusStop endDestionation) {
        // If a bus has a currentBusStop at a Start or End point:
        if (this.getEndPoint().equals(currentBusStop)) { //Bus was travveling from: a --> b, now it has to change its direction.
            return busConnections.get(busConnections.size() - 1).getStart();
        } else if(this.getStartPoint().equals(currentBusStop)) { //Bus was travveling from: b --> a, now it has to change its direction.
            return busConnections.get(0).getEnd();
        }
        
        boolean reversed = false;
        // A bus will travel from b --> a (this is called reversed) instead from a --> b (the normal flow)
        if (this.getStartPoint().equals(endDestionation)) { reversed = true; }
        
        for (BusConnection busCon : busConnections) {
            if (!reversed && busCon.getStart().equals(currentBusStop)) {
                return busCon.getEnd();
            } else if (reversed && busCon.getEnd().equals(currentBusStop)) {
                return busCon.getStart();
            }
        }

        return null;
    }
}

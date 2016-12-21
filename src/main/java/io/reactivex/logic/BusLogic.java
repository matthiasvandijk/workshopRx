/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.logic;

import io.reactivex.domain.Bus;
import io.reactivex.domain.BusStop;

/**
 *
 * @author Matthias
 */
public class BusLogic {
    public void beginDriving(Bus bus, boolean reversed) {
        if (bus.getCurrentBusStop() == null || bus.getEndDestination() == null) {
            if (!reversed) {
                bus.setCurrentBusStop(bus.getBusLine().getStartPoint());
                bus.setEndDestination(bus.getBusLine().getEndPoint());
            } else {
                bus.setCurrentBusStop(bus.getBusLine().getEndPoint());
                bus.setEndDestination(bus.getBusLine().getStartPoint());
            }
            System.out.println(bus.toString());
        }
    }
    
    public void goToNextStop(Bus bus) {
        BusStop nextStop = bus.getBusLine().getNextBusStop(bus.getCurrentBusStop(), bus.getEndDestination());
        bus.setCurrentBusStop(nextStop);
        
        if (nextStop.equals(bus.getEndDestination())) {
            bus.setEndDestination(bus.getBusLine().reverseEndDestination(bus.getEndDestination()));
        }
        
        System.out.println(bus.toString());
    }
}

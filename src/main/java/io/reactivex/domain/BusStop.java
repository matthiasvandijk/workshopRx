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
public class BusStop {
    private String naam;

    public BusStop(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "BusStop{" + "name=" + naam + '}';
    }
    
}

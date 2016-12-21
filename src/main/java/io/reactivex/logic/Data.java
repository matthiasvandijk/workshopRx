/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.logic;

import io.reactivex.domain.Bus;
import io.reactivex.domain.BusConnection;
import io.reactivex.domain.BusLine;
import io.reactivex.domain.BusStop;
import io.reactivex.domain.Passenger;

/**
 *
 * @author Matthias
 */
public class Data {
    public static BusLine b100;
    public static BusLine b200;
    public static BusLine b300;
    
    public static BusStop alpha;
    public static BusStop beta;
    public static BusStop charlie;
    public static BusStop delta;
    public static BusStop oudenoord;
    public static BusStop nijenoord;
    public static BusStop amsterdamsestraatweg;
    public static BusStop daltonlaan;

    //BusLine 100
    public static BusConnection alpha_beta;
    public static BusConnection beta_charlie;
    public static BusConnection charlie_delta;
    public static Bus bus10;
    public static Bus bus11;
    public static Bus bus12;
    
    //BusLine 200
    public static BusConnection alpha_oudenoord;
    public static BusConnection oudenoord_nijenoord;
    public static BusConnection nijenoord_daltonlaan;
    public static Bus bus20;
    public static Bus bus21;
    public static Bus bus22;
    
    //BusLine 300
    public static BusConnection beta_nijenoord;
    public static BusConnection nijenoord_amsterdamsestraatweg;
    public static Bus bus30;
    public static Bus bus31;
    
    //Passengers
    public static Passenger p1;
    public static Passenger p2;
    public static Passenger p3;
    public static Passenger p4;
    public static Passenger p5;
    public static Passenger p6;
    public static Passenger p7;
    public static Passenger p8;
    public static Passenger p9;
    public static Passenger p10;
    public static Passenger p11;
    public static Passenger p12;
    public static Passenger p13;
    public static Passenger p14;
    public static Passenger p15;
    
    static {
        b100 = new BusLine(100);
        b200 = new BusLine(200);
        b300 = new BusLine(300);
        
        alpha = new BusStop("alpha");
        beta = new BusStop("beta");
        charlie = new BusStop("charlie");
        delta = new BusStop("delta");
        oudenoord = new BusStop("oudenoord");
        nijenoord = new BusStop("nijenoord");
        amsterdamsestraatweg = new BusStop("amsterdamsestraatweg");
        daltonlaan = new BusStop("daltonlaan");
        
        //BusLine 100
        alpha_beta = new BusConnection(alpha, beta, 1.5, 5);
        beta_charlie = new BusConnection(beta, charlie, 1.5, 5);
        charlie_delta = new BusConnection(charlie, delta, 1.5, 5);
        b100.addConnction(alpha_beta);
        b100.addConnction(beta_charlie);
        b100.addConnction(charlie_delta);
        bus10 = new Bus(10, b100);
        bus11 = new Bus(11, b100);
        bus12 = new Bus(12, b100);

        //BusLine 200
        alpha_oudenoord = new BusConnection(alpha, oudenoord, 2, 7);
        oudenoord_nijenoord = new BusConnection(oudenoord, nijenoord, 2, 7);
        nijenoord_daltonlaan = new BusConnection(nijenoord, daltonlaan, 2, 7);
        b200.addConnction(alpha_oudenoord);
        b200.addConnction(oudenoord_nijenoord);
        b200.addConnction(nijenoord_daltonlaan);
        bus20 = new Bus(20, b200);
        bus21 = new Bus(21, b200);
        bus22 = new Bus(22, b200);
        
        //BusLine 300
        beta_nijenoord = new BusConnection(beta, nijenoord, 1, 3);
        nijenoord_amsterdamsestraatweg = new BusConnection(nijenoord, amsterdamsestraatweg, 1, 3);
        b300.addConnction(beta_nijenoord);
        b300.addConnction(nijenoord_amsterdamsestraatweg);
        bus30 = new Bus(30, b300);
        bus31 = new Bus(31, b300);
        
        //Passengers
        p1 = new Passenger(1, 10.00);
        p2 = new Passenger(2, 5.00);
        p3 = new Passenger(3, 8.00);
        p4 = new Passenger(4, 20.00);
        p5 = new Passenger(5, 3.00);
        p6 = new Passenger(6, 10.00);
        p7 = new Passenger(7, 45.00);
        p8 = new Passenger(8, 8.00);
        p9 = new Passenger(9, 4.00);
        p10 = new Passenger(10, 15.00);
        p11 = new Passenger(11, 13.00);
        p12 = new Passenger(12, 17.00);
        p13 = new Passenger(13, 6.00);
        p14 = new Passenger(14, 9.00);
        p15 = new Passenger(15, 2.00);
        
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.logic;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import reactive.PrintSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.subjects.PublishSubject;
import rx.subjects.Subject;

/**
 *
 * @author Matthias
 */
public class Main {
    public static void main(String[] args) {
        BusLogic bl = new BusLogic();
        bl.beginDriving(Data.bus20, true);
        bl.goToNextStop(Data.bus20);
        Data.bus20.passengers.onNext(Data.p1);
        Data.bus20.passengers.onNext(Data.p2);
        Data.bus20.passengers.onNext(Data.p3);
        bl.goToNextStop(Data.bus20);  
       
        Data.bus20.passengers.onNext(Data.p4);
    }
}

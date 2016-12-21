/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.reactive;

import rx.Subscriber;

/**
 *
 * @author Matthias
 */
public class PrintSubscriber extends Subscriber{
    private final String name;
    
    public PrintSubscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void onCompleted() {
        System.out.println(name + ": Completed");
    }
    
    @Override
    public void onError(Throwable e) {
        System.out.println(name + ": Error: " + e);
    }
    
    @Override
    public void onNext(Object v) {
        System.out.println(name + ": " + v);
    }
}

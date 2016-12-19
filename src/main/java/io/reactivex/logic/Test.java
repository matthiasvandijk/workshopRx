/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.logic;

import io.reactivex.observer.MyObserver;
import java.util.Arrays;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;


/**
 *
 * @author Matthias
 */
public class Test {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "Een",
            "WorkShop",
            "Voor",
            "PAFR"
        );
        Observable<String> obs1 = Observable.from(words);
        obs1.subscribe(new MyObserver());
        
    }
    
}       

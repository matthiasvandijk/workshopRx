/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.logic;

import reactive.MyObserver;
import java.util.Arrays;
import java.util.List;
import reactive.PrintSubscriber;
import rx.Observable;
import rx.Subscription;
import rx.subjects.ReplaySubject;


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
        Observable<String> obs1 = Observable.from(words).map(s -> "(Server)" + s);
        obs1.subscribe(new MyObserver());
        
        System.out.println("--------------------");
        
        Subscription obs1filtered = obs1
                .filter(v -> v.endsWith("r") || v.endsWith("R"))
                .subscribe(
                    v -> System.out.println(v),
                    e -> System.out.println("Error: " + e),
                    () -> System.out.println("Completed")
                );

        System.out.println("--------------------");
        
        Observable<String> test = Observable.create(sub -> {
            sub.onNext("a");
        });
        test.subscribe(new MyObserver());
        
        ReplaySubject<Integer> s = ReplaySubject.create();
        
        
    }
    
}       

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.examples;

import java.util.concurrent.TimeUnit;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;
import rx.subjects.ReplaySubject;

/**
 *
 * @author Matthias
 */
public class SubjectsExamples {
    public static void main(String[] args) throws InterruptedException {
        PublishSubject<Integer> s1 = PublishSubject.create();
        s1.onNext(1);
        s1.subscribe(System.out::println);
        s1.onNext(2);
        s1.onNext(3);
        
        System.out.println("-----------");
        
        ReplaySubject<Integer> s2 = ReplaySubject.create();  
        s2.subscribe(v -> System.out.println("#1: " + v));
        s2.onNext(1);
        s2.onNext(2);
        s2.subscribe(v -> System.out.println("~#2:" + v)); 
        s2.onNext(3);
        
        System.out.println("-----------");
        
        ReplaySubject<Integer> s3 = ReplaySubject.createWithSize(2); 
        s3.onNext(1);
        s3.onNext(2);
        s3.onNext(3);
        s3.subscribe(v -> System.out.println("Late: " + v)); 
        s3.onNext(4);
        
        System.out.println("-----------");
        
        ReplaySubject<Integer> s = ReplaySubject.createWithTime(150, TimeUnit.MILLISECONDS,
                                                        Schedulers.immediate());
        s.onNext(1);
        Thread.sleep(50);
        s.onNext(2);
        Thread.sleep(100);
        s.onNext(3);
        s.subscribe(v -> System.out.println("Late: " + v)); 
        s.onNext(4);
    }
}

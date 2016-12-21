/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reactivex.examples;

import rx.Subscription;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;

/**
 *
 * @author Matthias
 */
public class UnsubscribeExample {
    public static void main(String[] args) {
        
        Subject<Integer, Integer>  values = ReplaySubject.create();
        
        
        Subscription subscription = values.subscribe(
            v -> System.out.println(v),
            e -> System.err.println(e),
            () -> System.out.println("Done")
        );
        
        values.onNext(1);
        values.onNext(2);
        subscription.unsubscribe();
        values.onNext(3);
        
    }
}

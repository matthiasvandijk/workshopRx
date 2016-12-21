/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reactivex.examples;

import rx.Observable;
import rx.Subscription;

/**
 *
 * @author Matthias
 */
public class DistinctExample {
    public static void main(String[] args) {
        Observable<String> values = Observable.create(o -> {
            o.onNext("a");
            o.onNext("b");
            o.onNext("a");
            o.onNext("a");
            o.onNext("c");
            o.onCompleted();
        });

        Subscription subscription = values
            .distinct()
            .subscribe(
                v -> System.out.println(v),
                e -> System.out.println("Error: " + e),
                () -> System.out.println("Completed")
            );
    }
}

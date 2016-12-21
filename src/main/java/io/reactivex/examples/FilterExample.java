/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.examples;

import rx.Observable;
import rx.Subscription;

/**
 *
 * @author Matthias
 */
public class FilterExample {
    public static void main(String[] args) {
        Observable<Integer> values = Observable.range(0,10);
        Subscription oddNumbers = values
            .filter(v -> v % 2 == 0)
            .subscribe(
                v -> System.out.println(v),
                e -> System.out.println("Error: " + e),
                () -> System.out.println("Completed")
        );
    }
   
}

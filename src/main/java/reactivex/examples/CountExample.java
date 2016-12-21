/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reactivex.examples;

import reactivex.reactive.PrintSubscriber;
import rx.Observable;

/**
 *
 * @author Matthias
 */
public class CountExample {
    public static void main(String[] args) {
        Observable<String> values = Observable.just("A", "B", "C");

        values
            .subscribe(new PrintSubscriber("Values"));
        values
            .count()
            .subscribe(new PrintSubscriber("Count"));
    }
}

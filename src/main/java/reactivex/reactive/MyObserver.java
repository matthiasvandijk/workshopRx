/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reactivex.reactive;

import rx.Observable;
import rx.Observer;
import rx.Observer;
import rx.Subscriber;

/**
 *
 * @author Matthias
 */
public class MyObserver implements Observer<String> {

    @Override
    public void onCompleted() {
        System.out.println("MyObserver: is klaar en heeft geen fouten ondervonden.");
    }

    @Override
    public void onError(Throwable thrwbl) {
        System.out.println("MyObserver: Error");
    }

    @Override
    public void onNext(String t) {
        System.out.println("MyObserver: " + t);
    }
}

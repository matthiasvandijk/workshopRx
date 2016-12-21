/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reactivex.examples;

import java.util.Arrays;
import java.util.List;
import reactivex.reactive.MyObserver;
import rx.Observable;

/**
 *
 * @author Matthias
 */
public class ObservableFrom {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "Een",
            "WorkShop",
            "Voor",
            "PAFR"
        );
        Observable<String> obs1 = Observable.from(words).map(s -> "(iets er voor?)" + s);
        obs1.subscribe(new MyObserver());
    }
}

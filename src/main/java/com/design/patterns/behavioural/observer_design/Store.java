package com.design.patterns.behavioural.observer_design;

import com.design.patterns.behavioural.observer_design.observable.IphoneObservableImpl;
import com.design.patterns.behavioural.observer_design.observable.StocksObservable;
import com.design.patterns.behavioural.observer_design.observer.EmailAlertObserverImpl;
import com.design.patterns.behavioural.observer_design.observer.MobileAlertObserverImpl;
import com.design.patterns.behavioural.observer_design.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username",iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);

    }
}

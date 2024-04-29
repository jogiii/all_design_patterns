package com.design.patterns.behavioural.observer_design.observable;

import com.design.patterns.behavioural.observer_design.observer.NotificationAlertObserver;

public interface StocksObservable{
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockAdded);

    public int getStockCount();
}


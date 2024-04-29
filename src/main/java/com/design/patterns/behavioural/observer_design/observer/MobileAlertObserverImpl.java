package com.design.patterns.behavioural.observer_design.observer;
import com.design.patterns.behavioural.observer_design.observable.StocksObservable;


public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable){
        this.userName = username;
        this.observable = observable;
    }
    @Override
    public void update() {

        sendMessageOnMobile(userName,"product is in stock hurry up !");

    }

    public void sendMessageOnMobile(String userName, String msg){
        System.out.println("message sent to :"+userName);
    }
}

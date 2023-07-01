package design.pattern.observer;

import design.pattern.observer.observerable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    long phoneNumber;
    StockObservable observable;

    public MobileAlertObserver(long phoneNumber, StockObservable observable){
        this.phoneNumber = phoneNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendSMS(phoneNumber, "New Iphones arrived.");
    }

    private void sendSMS(long phoneNumber, String msg){
        System.out.println("Message sent to : "+phoneNumber+" with message : "+msg);
    }
}

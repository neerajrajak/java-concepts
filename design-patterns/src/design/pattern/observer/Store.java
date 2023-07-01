package design.pattern.observer;

import design.pattern.observer.observerable.IphoneObservableImpl;

public class Store {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserver("abc@mail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("xyz@mail.com", iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver(7666384816L, iphoneObservable);
        NotificationAlertObserver observer4 = new MobileAlertObserver(8877886655L, iphoneObservable);

        iphoneObservable.addSubscription(observer1);
        iphoneObservable.addSubscription(observer2);
        iphoneObservable.addSubscription(observer3);
        iphoneObservable.addSubscription(observer4);

        iphoneObservable.setStockCount(30);
    }
}

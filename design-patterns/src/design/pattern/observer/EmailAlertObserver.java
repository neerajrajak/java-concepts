package design.pattern.observer;

import design.pattern.observer.observerable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMail(this.emailId, "New Product Arrived");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Mail sent to : "+emailId+" with message : "+msg);
    }
}

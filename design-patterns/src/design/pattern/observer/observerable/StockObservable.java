package design.pattern.observer.observerable;

import design.pattern.observer.NotificationAlertObserver;

public interface StockObservable {
    public void addSubscription(NotificationAlertObserver obs);
    public void removeSubscription(NotificationAlertObserver obs);
    public void notifySubscribers();
    public void setStockCount(int newStock);
    public int getStockCount();
}

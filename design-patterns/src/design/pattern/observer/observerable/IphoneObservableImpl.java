package design.pattern.observer.observerable;

import design.pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> subscribers = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addSubscription(NotificationAlertObserver obs) {
        subscribers.add(obs);
    }

    @Override
    public void removeSubscription(NotificationAlertObserver obs) {
        subscribers.remove(obs);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver nao: subscribers){
            nao.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(stockCount == 0){
            this.notifySubscribers();
        }
        stockCount = stockCount + newStock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}

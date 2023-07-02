package design.pattern.proxy.heavyexample;

public class ExpensiveRequest {
    public static void main(String[] args) {

        ExpensiveObject expensiveRequest = new ExpensiveObjectImpl();
        expensiveRequest.processObject();
        expensiveRequest.processObject();
    }
}

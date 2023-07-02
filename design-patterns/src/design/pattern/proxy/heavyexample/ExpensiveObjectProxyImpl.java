package design.pattern.proxy.heavyexample;

public class ExpensiveObjectProxyImpl implements ExpensiveObject{

    private static ExpensiveObject object;

    @Override
    public void processObject() {
        if(object == null){
            object = new ExpensiveObjectImpl();
        }
        object.processObject();
    }
}

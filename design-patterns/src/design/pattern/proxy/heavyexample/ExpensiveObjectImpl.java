package design.pattern.proxy.heavyexample;

public class ExpensiveObjectImpl implements ExpensiveObject{

    public ExpensiveObjectImpl(){
        heavyOperation();
    }

    @Override
    public void processObject() {
        System.out.println("Your request is processed.");
    }

    public void heavyOperation(){
        System.out.println("Initial loading of system in process.");
    }
}

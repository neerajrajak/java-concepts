package design.pattern.factory;

public class VehicleLoan implements BankLoan{
    @Override
    public float getLoanInterest() {
        return 9;
    }
}

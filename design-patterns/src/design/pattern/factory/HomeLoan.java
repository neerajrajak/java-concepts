package design.pattern.factory;

public class HomeLoan implements BankLoan{

    @Override
    public float getLoanInterest() {
        return 8.5F;
    }
}

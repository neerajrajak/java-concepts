package design.pattern.factory;

public class BankFactory {

    public static BankLoan getLoanClass(String loanType){
        if(loanType.equalsIgnoreCase("home"))
            return new HomeLoan();
        else if(loanType.equalsIgnoreCase("vehicle"))
            return new VehicleLoan();
        else
            return null;
    }
}

package design.pattern.factory;

public class BankFactoryClient {

    public static void main(String[] args) {
        BankLoan loan = new HomeLoan();
        System.out.println("Home Loan Interest tightly coupled : "+ loan.getLoanInterest());

//        Here we can see we can only get home loan interest rate since it is tightly coupled
//        If we have multiple implementation of base class and we need the object based on input
//        during runtime than we can use Factory Design Pattern

//        To implement Factory design pattern we have created a factory class BankFactory which will
//        return us required classes during runtime

        Float homeLoan = BankFactory.getLoanClass("home").getLoanInterest();
        Float vehicleLoan = BankFactory.getLoanClass("vehicle").getLoanInterest();

        System.out.println("Home Loan from Factory : "+ homeLoan);
        System.out.println("Vehicle Loan from Factory : "+ vehicleLoan);
    }
}

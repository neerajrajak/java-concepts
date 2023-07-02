package design.pattern.proxy.restriction;

public class RestrictionDemo {
    public static void main(String[] args) {
        EmployeeDao emp = new EmployeeDaoImplProxy();
        try{
            emp.createEmployee("admin", new Employee());
            // emp.createEmployee("ltiuser", new Employee());
            emp.deleteEmployee("admin", 101);
            emp.getEmployee("ltiuser", 102);
            emp.deleteEmployee("ltiuser", 102);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

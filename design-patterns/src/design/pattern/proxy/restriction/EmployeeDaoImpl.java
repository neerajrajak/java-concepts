package design.pattern.proxy.restriction;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void createEmployee(String role, Employee emp) throws Exception {
        System.out.println("creates a new Employee.");
    }

    @Override
    public void deleteEmployee(String role, int empId) throws Exception {
        System.out.println("Given Employee Deleted.");
    }

    @Override
    public void getEmployee(String role, int emp) throws Exception {
        System.out.println("Returned requested employee.");
    }
}

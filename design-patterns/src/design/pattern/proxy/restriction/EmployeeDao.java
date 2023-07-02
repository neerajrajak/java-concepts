package design.pattern.proxy.restriction;

public interface EmployeeDao {

    public void createEmployee(String role, Employee emp) throws Exception;

    public void deleteEmployee(String role, int empId) throws Exception;

    public void getEmployee(String role, int empId) throws Exception;
}

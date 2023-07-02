package design.pattern.proxy.restriction;

public class EmployeeDaoImplProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoImplProxy(){
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void createEmployee(String role, Employee emp) throws Exception {
        if(role.equalsIgnoreCase("admin")){
            employeeDao.createEmployee(role, emp);
            return;
        }
        throw new Exception("Access Denied.");
    }

    @Override
    public void deleteEmployee(String role, int empId) throws Exception {
        if(role.equalsIgnoreCase("admin")){
            employeeDao.deleteEmployee(role, empId);
            return;
        }
        throw new Exception("Access Denied.");
    }

    @Override
    public void getEmployee(String role, int empId) throws Exception {
        if(role.equalsIgnoreCase("admin") || role.equalsIgnoreCase("ltiuser")){
            employeeDao.deleteEmployee(role, empId);
            return;
        }
        throw new Exception("You must be an LTI user.");
    }
}

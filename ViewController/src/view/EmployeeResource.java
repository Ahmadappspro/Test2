package view;

import java.util.ArrayList;
import java.util.List;

public class EmployeeResource {
    public List<Employee> getAllEmployees(){
        Employee employee = new Employee();
        List <Employee> list = new ArrayList<>();
        list.add(employee);
        return list;
        }
    public Employee getEmployeeById(int id){
            EmployeeDao employee = new EmployeeDao();
return employee.getEmp(id);
        
        } 
    public Employee insertEmployee(){
            EmployeeDao employee = new EmployeeDao();
          return null;
        }
    
}

package view;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("rest")
public class EmployeeService {

//    @GET
//    public List<Employee> getAllEmployees(){    
//   List <Employee> list = new ArrayList<>();
//    EmployeeDao e = new EmployeeDao();
////    list = e.getAllEmp();
//    return list;
//    
//    }
//    
    
     EmployeeDao employeeDAO = new EmployeeDao();
    @GET
    @Path("/getEmp/{id}")
@Produces("application/json")
    public Employee getEmp(@PathParam("id") int id){
        
           
            return employeeDAO.getEmp(id);
    }
            
            
    @POST
    @Consumes("application/json")
    @Produces("application/json") 
    @Path("/addemp")
        public Employee addEmployee(Employee emp){
        System.out.println("add Emp "+emp.getFirstName());
           Employee employee= employeeDAO.insertEmp(emp);
        
            return employee;
        
        }
                                         
                                                 

     
    
    
}

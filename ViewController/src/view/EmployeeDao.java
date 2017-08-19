package view;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;


public class EmployeeDao {

    public Employee getEmp(int employeeid) {
        //                  ArrayList <Employee> list = new ArrayList<>();
        Employee employee = null;
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

            //step3 create the statement object
            Statement stmt = con.createStatement();

            //step4 execute query
            ResultSet rs = stmt.executeQuery("select * from employees where EMPLOYEE_ID = " + employeeid);
            while (rs.next()){
                
                employee = new Employee();
                                          employee.setCommisionPct(rs.getInt("COMMISSION_PCT"));
                                              employee.setCommisionPct(rs.getInt("EMPLOYEE_ID"));
                                    employee.setFirstName(rs.getString("FIRST_NAME"));
                                        
            }
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            //step5 close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return employee;
    }
    public Employee insertEmp(Employee emp) {
        //                  ArrayList <Employee> list = new ArrayList<>();
        
        System.out.println(emp.getHireDate());
        Employee employee = null;
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            //step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

            //step3 create the statement object9/
            PreparedStatement stmt=con.prepareStatement("insert into employees values(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1,emp.getEmployeeId());
            stmt.setString(2, emp.getFirstName());
            stmt.setString(3, emp.getLastName());
            stmt.setString(4, emp.getEmail());
            stmt.setInt(5, emp.getPhoneNumber());
            stmt.setString(6,  emp.getHireDate());
            stmt.setString(7, emp.getJobId());
            stmt.setInt(8, emp.getSalary());
            stmt.setInt(9, emp.getCommisionPct());
            stmt.setInt(10, emp.getManegerId());
            stmt.setInt(11, emp.getDepartmentId());
            
            System.out.println(emp.getManegerId());  
            int i=stmt.executeUpdate();  
            System.out.println(i+" records inserted"); 
           

            //step4 execute query
//            ResultSet rs = stmt.executeQuery("insert  into employees values (?,?,?,?,?,?,?,?,?,?,?)");
//            while (rs.next()){
//                
                    
//                employee.setFirstName(rs.getString("FIRST_NAME"));
//                                        
//            }
    //                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            //step5 close the connection object
            
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return employee;
    }


}



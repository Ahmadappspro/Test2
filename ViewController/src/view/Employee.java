package view;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String hireDate;
    private String jobId;
    private int salary;
    private int commisionPct;
    private int manegerId;
    private int departmentId;
    
    public Employee(){}

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setCommisionPct(int commisionPct) {
        this.commisionPct = commisionPct;
    }

    public int getCommisionPct() {
        return commisionPct;
    }

    public void setManegerId(int manegerId) {
        this.manegerId = manegerId;
    }

    public int getManegerId() {
        return manegerId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }


    @Override
    public String toString() {
        // TODO Implement this method
        return ""+this.getHireDate();
    }
}



import model.Devoloper;
import service.DevoloperService;
import model.Employee;
import service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeService();
        Employee employee= employeeService.
                getEmployeeInfo("Kamran",26,7,500);
        System.out.println(employee);

        DevoloperService devoloperService=new DevoloperService();
        Devoloper devoloper= devoloperService.
                getDevoloperInfo("Samir",34,5,1100.0);
        System.out.println(devoloper);
    }}
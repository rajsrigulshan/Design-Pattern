package AbstractFactoryDesignPattern;

public class Client {
  
    public static void main(String[] args) {
        Employee employee=EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(employee);
        System.out.println(employee.employeeSalary());
        System.out.println(employee.employeeDept());


        Employee employee2=EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee2.employeeDept());
    }
    


}

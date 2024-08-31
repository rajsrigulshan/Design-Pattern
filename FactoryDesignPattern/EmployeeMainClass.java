public class EmployeeMainClass {
    public static void main(String[] args) {
       Employee employee=EmployeeFactory.getEmployee("Engineer");
       System.out.println(employee.employeeDept());

       Employee employee2=EmployeeFactory.getEmployee("Accountant");
       System.out.println(employee2.employeeDept());


    }
}

public class Accountant implements Employee {

    @Override
    public String employeeDept() {
        System.out.println("Employee belongs to Accounts department");
        return "Accounts";
    }

    @Override
    public int employeeSalary() {
         return 45000;
    }
    
}

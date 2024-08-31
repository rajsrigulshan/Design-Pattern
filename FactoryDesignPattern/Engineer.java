
public class Engineer implements Employee{

    @Override
    public String employeeDept() {
        System.out.println("Employee belongs to Engineering Department");
        return "Engineering";
        
    }

    @Override
    public int employeeSalary() {
        return 50000;
    }
    
}

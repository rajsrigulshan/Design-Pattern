package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee{

    @Override
    public String employeeDept() {
        System.out.println("I am Android Developer...");
        return "Android Developer";
    }

    @Override
    public int employeeSalary() {
        return 47000;
    }
    
}

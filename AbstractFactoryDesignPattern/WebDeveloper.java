package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public String employeeDept() {
        System.out.println("I am Web Developer...");
        return "Web Developer";
    }

    @Override
    public int employeeSalary() {
        return 50000;
    }
    
}

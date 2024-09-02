package AbstractFactoryDesignPattern;

public class AndroidDevFactory extends AbstractEmployeeFactory{

    @Override
    public Employee creatEmployee() {
        return new AndroidDeveloper();
    }
    
}

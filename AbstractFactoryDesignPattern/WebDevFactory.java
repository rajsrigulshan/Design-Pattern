package AbstractFactoryDesignPattern;

public class WebDevFactory extends AbstractEmployeeFactory{

    @Override
    public Employee creatEmployee() {
        return new WebDeveloper();
    }
    
}

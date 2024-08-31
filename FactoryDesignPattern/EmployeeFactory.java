public class EmployeeFactory {
   public static Employee getEmployee(String employee){
    if(employee.trim().equalsIgnoreCase("ENGINEER"))
        return new Engineer();
    else if(employee.trim().equalsIgnoreCase("ACCOUNTANT"))
        return new Accountant();
    else
    return null;
   }
}

package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {

    //Object creation throug new keyword. 

    //    User user= new User.UserBuilder().setEmail("raj@gmail.com").setId(1).setSalary(45000).build();
    //    System.out.println(user);
      
    
       // Object creation through static method.
      User user2= User.UserBuilder.builder().setEmail("gulshan@gmail.com").setId(2).build();
      System.out.println(user2);

    }
}

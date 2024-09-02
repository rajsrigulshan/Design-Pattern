package BuilderDesignPattern;

// generally we use builder design pattern for the immutable objects.
public class User {
    private final int id;
    private final int salary;
    private final String email;

    private User(UserBuilder userBuilder) {
        // we can handle some default value here manually.
        this.id=userBuilder.id;
        this.salary=userBuilder.salary;
        this.email=userBuilder.email;
        
    }

    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public String getEmail() {
        return email;
    }
    


    // Inner class to create Object

    @Override
    public String toString() {
        return "User [id=" + id + ", salary=" + salary + ", email=" + email + "]";
    }



    static class UserBuilder {
        private int id;
        private int salary;
        private String email;

        private UserBuilder(){

        }
        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }
        public UserBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            User user=new User(this);
            return user;
        }

        
        
    }




    

}

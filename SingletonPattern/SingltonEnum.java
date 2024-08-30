package SingletonPattern;

public enum SingltonEnum {
    
    INSTANCE;// this will create a instance so every variable constant in enum can create only one instance.

    public void doSomeThing(){
        System.out.println("I just print, I was told to do so...");
    }

}

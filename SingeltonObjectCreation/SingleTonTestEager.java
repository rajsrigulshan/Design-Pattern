package SingeltonObjectCreation;

public class SingleTonTestEager {
    private SingleTonTestEager(){

    }

    private static SingleTonTestEager singleTonTestEager=new SingleTonTestEager();

    public static  SingleTonTestEager getSingleTonTestEagerObj(){
        return singleTonTestEager;
    }

    public void printObjProps(){
        System.out.println("SingleTon Object is called with eager loading...");
    }
    
}

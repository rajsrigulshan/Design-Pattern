package SingletonPattern;
import java.io.Serializable;

// Lazy loading singleTon Pattern
public class SingeltonTestClass implements Serializable, Cloneable{

    private static SingeltonTestClass singleTonObj;
    private SingeltonTestClass(){
        if(singleTonObj!=null)
        {
            throw new RuntimeException("You are trying to break singlton pattern");
        }

    }

    public static SingeltonTestClass getSingeltonTestClassObj(){
        if(singleTonObj==null){
            synchronized(SingeltonTestClass.class){ // synchronization is used to avoid creating the multiple object through diff threads.
                if(singleTonObj==null){
                    singleTonObj=new SingeltonTestClass();
                }
            }
        }
        return singleTonObj;
    }

    private Object readResolve(){
        return singleTonObj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
    SingeltonTestClass cloned = (SingeltonTestClass) super.clone();
    // Clone mutable objects here if any
    // return cloned;
    return singleTonObj;
}

    public void printObj(){
        System.out.println("Singleton obj called with lazy loading...");
    }

}

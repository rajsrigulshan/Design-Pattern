package SingeltonObjectCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.*;

public class SingeltonObjectCreation {
    public static void main(String[] args){
        //    SingeltonTestClass obj1= SingeltonTestClass.getSingeltonTestClassObj();
        //    SingeltonTestClass obj2= SingeltonTestClass.getSingeltonTestClassObj();
        //    SingleTonTestEager obj3= SingleTonTestEager.getSingleTonTestEagerObj();
        //    SingleTonTestEager obj4= SingleTonTestEager.getSingleTonTestEagerObj();

        //    System.out.println(obj1.hashCode());
        //    System.out.println(obj2.hashCode());
        //    System.out.println(obj3.hashCode());
        //    System.out.println(obj4.hashCode());

        //    obj1.printObj();
        //    obj3.printObjProps();


        /*
         * Reflection API to break singleton pattern.
         * 
         * Solution 1:- if object is there throw exception from inside constructor.
         * Solution 2:- use ENUM then reflection APIs can't also change.
         * 
         * Singleton can break through the object serialization and de-serialization.
         * Solution:- Use function readResolve() in the class in which u want same object after sereilization and de-serielization.
         * 
         * object cloning can also break the singleton pattern.
         * Solution:- return the same reference of the object from the clone function which is override in the class.
         * 
         */
        

        // Implementing exception thrown from the constructor    

        //  SingeltonTestClass obj1=SingeltonTestClass.getSingeltonTestClassObj();
        //  System.out.println(obj1.hashCode()+" first object created...");

        //  try {
        //     Constructor<SingeltonTestClass> constructor=SingeltonTestClass.class.getDeclaredConstructor();
        //     constructor.setAccessible(true);
        //     try {
        //         SingeltonTestClass obj2=constructor.newInstance();
        //         System.out.println(obj2.hashCode()+" second object created...");
        //     } catch (InstantiationException e) {
        //         e.printStackTrace();
        //     } catch (IllegalAccessException e) {
        //         e.printStackTrace();
        //     } catch (IllegalArgumentException e) {
        //         e.printStackTrace();
        //     } catch (InvocationTargetException e) {
        //         e.printStackTrace();
        //     }
        // } catch (NoSuchMethodException e) {
        //     e.printStackTrace();
        // } catch (SecurityException e) {
        //     e.printStackTrace();
        // }


        //Implementing the ENUM solution


        // SingltonEnum s1=SingltonEnum.INSTANCE;
        // System.out.println(s1.hashCode()+" first enum instance created...");
        // s1.doSomeThing();

        // you can't create a secong instance by Reflection APIs just as above.
        

        // try {
        //         Constructor<SingltonEnum> constructor=SingltonEnum.class.getDeclaredConstructor();
        //         constructor.setAccessible(true);
        //         try {
        //             SingltonEnum obj2=constructor.newInstance();  
        //             System.out.println(obj2.hashCode()+" second enum instance created...");
        //         } catch (InstantiationException e) {
        //             e.printStackTrace();
        //         } catch (IllegalAccessException e) {
        //             e.printStackTrace();
        //         } catch (IllegalArgumentException e) {
        //             e.printStackTrace();
        //         } catch (InvocationTargetException e) {
        //             e.printStackTrace();
        //         }
        //     } catch (NoSuchMethodException e) {
        //         e.printStackTrace();
        //     } catch (SecurityException e) {
        //         e.printStackTrace();
        //     }


        //testing through the serialization and de-serialization.

        // SingeltonTestClass s1=SingeltonTestClass.getSingeltonTestClassObj();
        // System.out.println(s1.hashCode()+"  first object created...");

        // try {
        //     ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("output.ser"));
        //     oos.writeObject(s1);
        //     s1.printObj();
        //     System.out.println("Object is serialized...");
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // try {
        //     FileInputStream file=new FileInputStream("output.ser");
        //     try (ObjectInputStream deszObj=new ObjectInputStream(file)){
                
        //         try {
        //             SingeltonTestClass s2=(SingeltonTestClass) deszObj.readObject();
        //             System.out.println("object is de-serialized...");
        //             System.out.println(s2.hashCode()+" Second object is created...");
        //             System.out.println(s2.hashCode());
        //             s2.printObj();

        //         } catch (ClassNotFoundException e) {
        //             e.printStackTrace();
        //         }
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }



        //Testing Cloning process to break singleton pattern.


        SingeltonTestClass s1=SingeltonTestClass.getSingeltonTestClassObj();
        System.out.println(s1.hashCode());
        System.out.println("first object created...");

        try {
            SingeltonTestClass s2=(SingeltonTestClass)s1.clone();
            System.out.println("first object cloned...");
            System.out.println(s2.hashCode());
            s2.printObj();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        
        
        

    }
}

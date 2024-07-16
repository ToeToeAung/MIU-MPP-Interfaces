package Interfaces.Singletons;

public class Main {
    public static void main(String[] args) {
     //MySingleton mytest=new  MySingleton.INSTANCE.behavior();
        //Enum to create a singleton
       // MySingleton.INSTANCE.behavior();
       MySingleton instance1 = MySingleton.INSTANCE;
       MySingleton instance2 = MySingleton.INSTANCE;


       if(instance1 == instance2){
           System.out.println("Instances are equal");
       }else{
           System.out.println("Instances are not equal");
       }

    }
}

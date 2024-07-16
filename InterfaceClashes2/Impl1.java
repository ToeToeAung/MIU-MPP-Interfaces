package Interfaces.InterfaceClashes2;

public class Impl1 implements Sup1,Sup2 {
    //Must either be declared abstract method or implement abstract method myMethod in sup1
    public void myMethod(){
        int x=1;
        System.out.println(x);
    }
}

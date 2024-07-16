package Interfaces.InterfaceClashes1;

public interface SupInt1 extends ITop{
    default void myMethod(int x){
        System.out.println(x+x);
    }
}

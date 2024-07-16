package Interfaces.InterfaceClashes3;

public interface SupInt1 {
    default void myMethod(int x){
        System.out.println(x);
    }
}

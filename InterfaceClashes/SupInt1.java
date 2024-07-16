package Interfaces.InterfaceClashes;

public interface SupInt1 {
    default void myMethod(int x){
        System.out.println(x);
    }
}

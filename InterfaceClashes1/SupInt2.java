package Interfaces.InterfaceClashes1;

public interface SupInt2 extends ITop {
    default void myMethod(int x){
        System.out.println(x);
    }
}

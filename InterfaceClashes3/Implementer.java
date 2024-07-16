package Interfaces.InterfaceClashes3;

public class Implementer extends SupClass implements SupInt1{
    //**** Super class wins ****
    public static void main(String[] args) {

        Implementer obj = new Implementer();
        obj.myMethod(8);
    }
}

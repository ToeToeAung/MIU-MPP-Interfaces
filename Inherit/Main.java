package Interfaces.Inherit;

public class Main {
    public static void main(String[] args) {
        (new Impl()).myMethod(4);

        (new SubImpl()).myMethod(5);

    }
}

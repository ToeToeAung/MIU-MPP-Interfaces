package Interfaces.Iterators;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.List;
public class IteratorEx1 {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        System.out.println(" using new foreach method");
        stringList.forEach(consumer);
    }

}

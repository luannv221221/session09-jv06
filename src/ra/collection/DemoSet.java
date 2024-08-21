package ra.collection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat("Tom",29);
        Cat cat2 = new Cat("Mip",18);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat1);

        for (Cat cat : cats) {
            System.out.println(cat.getCatName());
        }
    }
}

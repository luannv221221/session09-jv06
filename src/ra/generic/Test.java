package ra.generic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner();

        System.out.println(Pattern.matches("[1-9]","11"));
        DemoGeneric<String> generic = new DemoGeneric<>();
        generic.setElement("Chuoi");

        DemoGeneric<Integer> demoGeneric = new DemoGeneric<>();

        demoGeneric.setElement(10);

        // Dictionary
        Dictionary<String,String> dictionary = new Dictionary<>();
        dictionary.setKey("love");
        dictionary.setValue("Yeu");
        System.out.println(dictionary.getKey() + ":"+dictionary.getValue());
        Dictionary<Integer,String> dictionary1 = new Dictionary<>();
        dictionary1.setKey(1);
        dictionary1.setValue("One");
        System.out.println(dictionary1.getKey() + ":"+dictionary1.getValue());

    }
}

package lesson_13.class_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFillDemo {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        // add elements in the list
        arrList.add("AAA");
        arrList.add("BBB");
        arrList.add("CCC");
        arrList.add("AAA");
        arrList.add("BBB");
        arrList.add("CCC");
        System.out.println(arrList);

        Collections.fill(arrList, "Java");
        System.out.println(arrList);
    }
}

package lesson_09.class_09.encapsulation;

import java.util.Arrays;

public class DemoEncapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation(); // empty constructor
        System.out.println(encapsulation.publicEncapsulation);
        System.out.println(encapsulation.defaultEncapsulation);
        System.out.println(encapsulation.protectedEncapsulation);
        encapsulation.publicEncapsulation = "Changing the value of the public field";
        // encapsulation.defaultEncapsulation = "smth"; // not possible, it's final field (constant)
        // System.out.println(encapsulation.privateEncapsulation);

        System.out.println(encapsulation.publicEncapsulation = " bye!");
        encapsulation.publicMethod();
        // encapsulation.privateMethod();
        encapsulation.defaultMethod();
        encapsulation.protectedMethod();

        System.out.println("Getter: " + encapsulation.getPrivateEncapsulation());

        // encapsulation.getPrivateEncapsulation("new") = "";

        encapsulation.setPrivateEncapsulation("New private value");
        System.out.println("Getter: " + encapsulation.getPrivateEncapsulation());

        // encapsulation.arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(encapsulation.arr));
        for (int i = 0; i < encapsulation.arr.length; i++) {
            encapsulation.arr[i] = 10;
        }
        System.out.println(Arrays.toString(encapsulation.arr));

        // encapsulation.CONSTANT_5 = 6;

        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);


    }

    /*private class DemoEncapsulation2 {

    }*/
}

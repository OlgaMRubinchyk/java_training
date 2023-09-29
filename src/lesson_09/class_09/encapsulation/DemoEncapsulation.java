package lesson_09.class_09.encapsulation;

import java.util.Arrays;

public class DemoEncapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();

        System.out.println(encapsulation.publicEncapsulation);
        System.out.println(encapsulation.defaultEncapsulation);
        System.out.println(encapsulation.protectedEncapsulation);
        // System.out.println(encapsulation.privateEncapsulation); // cannot access
        encapsulation.publicEncapsulation = "Changing the value of the public field.";
        // encapsulation.defaultEncapsulation = "something"; // not possible, we have final field (constant)

        System.out.println(encapsulation.publicEncapsulation = " bye!");

        encapsulation.publicMethod();
        encapsulation.defaultMethod();
        System.out.println("Getter: " + encapsulation.getPrivateEncapsulation());
        // encapsulation.getPrivateEncapsulation() = "Changing the value of the private field."; // impossible

        encapsulation.setPrivateEncapsulation("New private value");
        System.out.println("Getter: " + encapsulation.getPrivateEncapsulation());

        // encapsulation.arr = {7, 7, 4, 3, 2};
        System.out.println(Arrays.toString(encapsulation.arr));
        for (int i = 0; i < encapsulation.arr.length; i++) {
            encapsulation.arr[i] = 10;
        }
        System.out.println(Arrays.toString(encapsulation.arr));

        // encapsulation.constant_5 = 6; // not possible

        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);
    }

    /*private class DemoEncapsulation2 { // class can be private inside the main class

    }*/
}

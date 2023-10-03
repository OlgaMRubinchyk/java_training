package lesson_09.class_09.staticdemo;

public class StaticDemo {
    public static void main(String[] args) {
        Penguin boris = new Penguin("Boris", 3);
        Penguin kaloyan = new Penguin("Kaloyan", 10);
        // Penguin kaloyan2 = new Penguin(); java is not creating default constructor, because another is created

        boris.displayDetails();
        kaloyan.displayDetails();

        System.out.println(boris.color);
        System.out.println(kaloyan.color);

        kaloyan.color = "Pink with green hair";
        System.out.println(boris.color);
        System.out.println(kaloyan.color);

        System.out.println(Penguin.color);

        // boris.makeASound();
        Penguin.makeASound();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Utils.sumArr(arr));
    }
}

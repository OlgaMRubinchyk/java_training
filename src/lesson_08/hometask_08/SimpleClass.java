package lesson_08.hometask_08;

public class SimpleClass {
    public static void main(String[] args) {
        Test test1 = new Test();
        System.out.println(test1.findLength());

        test1 = test1.add(12, 43);
        System.out.println(test1.getX() + " " + test1.getY());
    }
}

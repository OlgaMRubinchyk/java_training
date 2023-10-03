package lesson_09.methodoverriding;

public class Parent {

    int testNumb;

    public Parent(int testNumb) {
        this.testNumb = testNumb;
    }

    public Parent() {}

    void methodOverride(int a, String b) {
        System.out.println("Test!");
    }

    private void privateMethod() {
        System.out.println("private");
    }
}

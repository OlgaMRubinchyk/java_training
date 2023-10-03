package lesson_09.methodoverriding;

public class Child extends Parent {

    public Child() {
        super(10);
    }
    @Override
    protected void methodOverride(int a, String b) {
        // this == super // usage is same (Child class == Parent class)
        super.methodOverride(10, " "); // call method from Parent class
        //super.privateMethod(); method is private in super class
        System.out.println("Child Test!");

    }

}

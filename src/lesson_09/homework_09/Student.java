package lesson_09.homework_09;

public class Student extends Person {
    double grade;
    // constructor
    Student(String firstName, String lastName, int age, String gender, double grade) {
        super(firstName, lastName, age, gender);
        this.grade = grade;
    }
    public void showStudentInfo() {
        showPersonInfo();
        System.out.println("Grade: " + grade);
    }
}

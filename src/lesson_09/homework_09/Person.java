package lesson_09.homework_09;

import org.w3c.dom.ls.LSOutput;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void showPersonInfo() {
        System.out.println("Name is: " + firstName + ", Last name is: " + lastName +
                ", Age: " + age + ", Gender: " + gender);
    }
}

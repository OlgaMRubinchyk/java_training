package lesson_09.homework_09;

public class Demo {
    public static void main(String[] args) {
        // array with 10 elements of type Person
        Person[] persons = new Person[10];
        // creating 3 objects of type Person
        persons[0] = new Person("Person1 FirstName", "Person1 LastName", 17, "other");
        persons[1] = new Person("Person2 FirstName", "Person2 LastName", 27, "male");
        persons[2] = new Person("Person3 FirstName", "Person3 LastName", 37, "female");
        // creating 3 objects of type Student
        persons[3] = new Student("Alex", "Alexeev", 15, "other", 100);
        persons[4] = new Student("Vasylyna", "Ivanova", 25, "male", 10);
        persons[5] = new Student("Taras", "Tarasov", 45, "female", 0);
        // creating 3 objects of type Lector
        persons[6] = new Lector("William", "Murdoc", 45, "male", 400);
        persons[7] = new Lector("Juliia", "Ogdan", 42, "female", 700);
        persons[8] = new Lector("George", "Crabtree", 28, "other", 200);
        // other
        persons[9] = new Person("Person4 FirstName", "Person4 LastName", 100, "unknown");

        for (Person i : persons) {
            if (i instanceof Lector) {
                ((Lector) i).showLectorInfo();
            } else if (i instanceof Student) {
                ((Student) i).showStudentInfo();
            } else {
                i.showPersonInfo();
            }
        }

        System.out.println();
        System.out.println();

        int overtimeHoursForAll = 4;

        for (Person i : persons) {
            if (i instanceof Lector) {
                System.out.println("Lector's name: " + i.getFirstName() + " " + i.getLastName() + ", Overtime payment: " + ((Lector) i).calculateOvertime(overtimeHoursForAll));
            }
        }

    }
}

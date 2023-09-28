package lesson_09.homework_09;

public class Lector extends Person {
    double dailySalary;
    final int EXPERIENCED_LECTOR_AGE = 30;
    final int WORKING_HOURS_IN_DAY = 6;
    Lector(String firstName, String lastName, int age, String gender, double dailySalary) {
        super(firstName, lastName, age, gender);
        this.dailySalary = dailySalary;
    }

    public void showLectorInfo() {
        showPersonInfo();
        System.out.println("Daily salary: " + dailySalary);
    }

    public double calculateOvertime(double hours) {
        double paymentForOvertime;
        // returns the amount of all extra working hours
        if (getAge() > EXPERIENCED_LECTOR_AGE) {
            paymentForOvertime = (dailySalary / WORKING_HOURS_IN_DAY) * hours * 2;
            return paymentForOvertime;
        } else {
            return 0;
        }

    }
}

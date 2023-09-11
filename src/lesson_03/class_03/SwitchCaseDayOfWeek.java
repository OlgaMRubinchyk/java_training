package lesson_03.class_03;

import java.util.Scanner;

public class SwitchCaseDayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int userNumber = sc.nextInt();

        switch (userNumber) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number [1 - 7]");
        }

        // reusing the code
        switch (userNumber) {
            case 1 :
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong number [1 - 7]");
        }

        // from Java 13 returning a value: using yield
        String day = switch (userNumber) {
            case 1 :
            case 2:
            case 3:
            case 4:
            case 5:
                yield "Workday!";
            case 6:
            case 7:
                yield "Weekend!";
            default:
                yield "Wrong number [1 - 7]";
        };
        System.out.println(day);

        // from Java 12: lambda - instead of switch case, no need to use break
        switch (userNumber) {
            case 1 -> {
                System.out.println("Monday");
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong number [1 - 7]");
        }

    }
}

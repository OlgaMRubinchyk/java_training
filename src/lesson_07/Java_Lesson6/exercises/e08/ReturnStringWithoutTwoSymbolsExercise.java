package exercises.e08;

public class ReturnStringWithoutTwoSymbolsExercise {
    public static void main(String[] args) {
        String str = "photo";
        System.out.println(shortString(str));
    }
    public static String shortString(String str1) {
        String str2 = str1.substring(2);
        String first = str1.substring(0,1);
        String second = str1.substring(1,2);

        if (first.equals("h")) {
            str2 = second + str2;
        }
        if (second.equals("g")) {
            str2 = first + str2;
        }

        return str2;
    }
}

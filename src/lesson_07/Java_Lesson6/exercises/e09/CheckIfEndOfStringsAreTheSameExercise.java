package exercises.e09;

public class CheckIfEndOfStringsAreTheSameExercise {
    public static void main(String[] args) {
        String string1 = "xyz";
        String string2 = "pqrxyz";
        boolean result = checkStrings(string1, string2);
        System.out.println("The given strings are " + string1 + " and " + string2);
        System.out.println("Does one string appears at the end of other? " + result);
    }
    public static boolean checkStrings(String str1, String str2) {
        return str1.toLowerCase().endsWith(str2.toLowerCase()) || str2.toLowerCase().endsWith(str1);
    }
}

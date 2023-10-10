package lesson_07.hometask_07;
/*Write a method to read a string entered by the user. The method should return a
        string without the first 2 characters. You save the first character if it is "g" and
        save the second if it is "h".
        Example:
        Input:
        goat
        photo
        ghost
        Output:
        gat
        hoto
        ghost*/
public class Task08 {
    public static void main(String[] args) {
        String s1 = "ghost";
        System.out.println(removeCharacters(s1));
    }

    public static String removeCharacters(String input) {
        String output = "";
        if (input.charAt(0) == 'g') {
            output = input.substring(0,1);
        }

        if (input.charAt(1) == 'h') {
            output += input.substring(1);
            return output;
        }

        output += input.substring(2);
        return output;
    }
}

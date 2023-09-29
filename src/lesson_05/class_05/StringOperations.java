package lesson_05.class_05;

public class StringOperations {
    public static void main(String[] args) {
        // ************* concat
        String concat = "Welcome ";
        String concat2 = "Java! ";

        String combined = concat2 + concat2; // using +
        System.out.println(combined);

        System.out.println(concat.concat(combined));

        concat += concat2;
        System.out.println(concat);

        String badPractice = "";
        for (int i = 0; i < 10; i++) {
            badPractice += i + " ";
            // 1 2 3 4 ....
        } // creates 3 new strings at each iteration
        System.out.println(badPractice);

        StringBuilder bestPractice = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            bestPractice.append(i).append(" ");
        }
        System.out.println(bestPractice);
        System.out.println(bestPractice.reverse());

        // ***** Length ***********
        System.out.println(concat.length());

        // substring
        String substringExample = "This is a really long long string";
        System.out.println("From index 10 till the end: " + substringExample.substring(10));
        System.out.println("From index 10 till the index 20: " + substringExample.substring(10, 22));

        // indexOf(), lastIndexOf()
        String anotherSentence = "Awesome Java course Java this Java is - Java";
        System.out.println(anotherSentence.indexOf("Java")); //8
        System.out.println(anotherSentence.lastIndexOf("Java")); //40

        // charAt()
        String charAtExample = "How many times we see the letter a here?";
        int counter = 0;
        ///**************************** add code here
        for (int index = 0; index < charAtExample.length(); index++) {
            if (charAtExample.charAt(index) == 'a') {
                counter++;
            }
        }
        //
        System.out.println(substringExample.toUpperCase());
        System.out.println(substringExample.toLowerCase());

        // replace
        String replaceDemo = "Hello, World !?%$&^&*^&* ... Hello";
        System.out.println(replaceDemo.replace("Hello", "Hi"));
        System.out.println(replaceDemo.replaceAll("[^a-zA-Z ]", "")); // using regex
        System.out.println(replaceDemo.replaceFirst("[^a-zA-Z ]", ""));
    }
}

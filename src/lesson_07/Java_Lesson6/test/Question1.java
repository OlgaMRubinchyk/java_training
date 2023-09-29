package test;

public class Question1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            s1.append(i);
        }
        System.out.println(s1.toString().hashCode()); // -1603650502
                                                    // 245257410
    }
}

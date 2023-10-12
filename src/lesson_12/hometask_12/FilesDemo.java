package lesson_12.hometask_12;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FilesDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Aaron", new String[]{"File1.txt", "File2.java", "File3.javka", "", null});
        Student student2 = new Student("Benjamin", new String[]{"File1.txt", "File2.java", "File1.txt", "", "File1.txt"});
        Student student3 = new Student("Cody", new String[]{"File1.java", "File2.java", "File1.txt", "File1.txt", "File1.txt"});

        System.out.println("Student " + student1.getName() + " has " + student1.checkFileExtension() + " points.");
        System.out.println("Student " + student2.getName() + " has " + student2.checkFileExtension() + " points.");
        System.out.println("Student " + student3.getName() + " has " + student3.checkFileExtension() + " points.");
    }

}

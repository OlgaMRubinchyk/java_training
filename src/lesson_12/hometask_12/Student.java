package lesson_12.hometask_12;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    ArrayList<File> fileList = new ArrayList<>();
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, ArrayList<String> fileList, int score) {
        this.name = name;
        for (String fileName : fileList) {
            try {
                this.fileList.add(new File(fileName));
            } catch(NullPointerException e) {
                this.fileList.add(null);
            }
        }
        this.score = score;
    }

    private int checkFileExtension(String fileName) throws FileException{
        if (fileName == null || fileName.equals("")) {
            score--;
            throw new FileException("File name is null or empty :(");
        }
        int index = fileName.lastIndexOf('.');
        // find extension
        String fileExtension = fileName.substring(index + 1);
        if (fileExtension.equals("java")) {
            score++;
        }
        return score;
    }
    public int checkFileExtension() {
        for (File file: fileList) {
            try {
                if (file == null) {
                    checkFileExtension(null);
                }
                checkFileExtension(file.getName());
            } catch (FileException e) {
                System.out.println(e.getMessage());
            }
        }
        return score;
    }



}

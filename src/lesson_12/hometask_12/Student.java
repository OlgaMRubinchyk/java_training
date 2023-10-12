package lesson_12.hometask_12;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String[] fileNames;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFileNames() {
        return fileNames;
    }

    public void setFileNames(String[] fileNames) {
        this.fileNames = fileNames;
    }

    public Student(String name, String[] fileNames) throws FileException {
        this.name = name;
        this.fileNames = fileNames;
        this.score = 0;
    }

    public int checkFileExtension(String fileName) throws FileException{
        if (fileName == null || fileName.equals("")) {
            score--;
            throw new FileException("File name is null or empty :(");
        }
        int index = fileName.lastIndexOf('.');
        // find extension
        String fileExtension = fileName.substring(index + 1);
        if (fileExtension.equals("java")) {
            //score++;
            return 1;
        } else {
            return 0;
        }
        //return score;
    }
    public int checkFileExtension() {
        for (String fileName: fileNames) {
            try {
                /*if (fileName == null) {
                    checkFileExtension(null);
                }*/
                score += checkFileExtension(fileName);
            } catch (FileException e) {
                System.out.println(e.getMessage());
            }
        }
        return score;
    }

    /*public int checkFileExtension(String fileName) {
        //for (String fileName: fileNames) {
            try {
                if (fileName == null) {
                    checkFileExtension(null);
                }
                checkFileExtension(fileName);
            } catch (FileException e) {
                System.out.println(e.getMessage());
            }
        //}
        return score;
    }*/



}

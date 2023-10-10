package lesson_12.hometask_12;

public class FileException extends Exception {
    public FileException(String message) {
        super(message);
    }
    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

}

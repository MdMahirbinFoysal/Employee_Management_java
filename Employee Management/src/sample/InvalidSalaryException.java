package sample;

import java.io.Serializable;

public class InvalidSalaryException extends Exception implements Serializable {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

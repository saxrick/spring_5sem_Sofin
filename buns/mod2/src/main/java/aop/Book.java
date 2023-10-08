package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Crime and punishment")
    private String name;
    @Value("Dostoyevskiy")
    private String Author;
    @Value("1866")
    private int yearOfPublication;
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}

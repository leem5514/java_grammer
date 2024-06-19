package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AuthorRepository {


    private final List<Author> authorList = new ArrayList<>();

    public void register(Author author) {
        authorList.add(author);
    }

    public Optional<Author> findByEmail(String email) {
        return authorList.stream().filter(author -> author.getEmail().equals(email)).findFirst();
    }
}
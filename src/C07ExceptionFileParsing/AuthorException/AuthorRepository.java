package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorRepository {

    List<Author> authorList;
    AuthorRepository() {
        authorList = new ArrayList<Author>();
    }

    void register(Author author) {
        this.authorList.add(author);
    }
}

package C07ExceptionFileParsing.AuthorException;

// AuthorRepository repository = new AuthorRepository

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AuthorService {

    AuthorRepository authorRepository;
    AuthorService() { authorRepository = new AuthorRepository();}

    public static void register (String name, String email, String password) throws IllegalArgumentException{
        Author authorList = new Author(name, email, password);

        if (password.length() < 8) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }if (!Pattern.matches("^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", email)) {
            throw new IllegalArgumentException("이메일 형식이 올바르지 않습니다.");
        }if(authorList.getEmail().equals(email)) {
            throw new IllegalArgumentException("같은 이메일은 들어갈 수 없습니다");
        }

    }
    public static void login (String email, String password) throws IllegalArgumentException {

    }
}

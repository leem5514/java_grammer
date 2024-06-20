package C07ExceptionFileParsing.AuthorException;

// AuthorRepository repository = new AuthorRepository

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }
    public void register(String name, String email, String password) throws NoSuchFieldException, IllegalArgumentException{
        if (repository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
        }
        if (!Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email)) {
            throw new NoSuchFieldException("이메일 형식이 올바르지 않습니다.");
        }
        if (password.length() <= 5) {
            throw new IllegalArgumentException("비밀번호는 5자리보다 길어야 합니다.");
        }

        Author author = new Author(name, email, password);
        repository.register(author);
    }

    public Author login(String email, String password) throws Exception, IllegalArgumentException {
        Optional<Author> optionalAuthor = repository.findByEmail(email);
        if (!optionalAuthor.isPresent()) {
            throw new Exception("존재하지 않는 사용자입니다.");
        }

        Author author = optionalAuthor.get();
        if (!author.getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }

        return author;
    }

    public Author findByEmail(String email) throws Exception {
        Optional<Author> optionalAuthor = repository.findByEmail(email);
        if (!optionalAuthor.isPresent()) {
            throw new Exception("존재하지 않는 사용자입니다.");
        }
        return optionalAuthor.get();
    }
}
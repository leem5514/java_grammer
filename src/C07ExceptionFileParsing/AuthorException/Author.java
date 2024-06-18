package C07ExceptionFileParsing.AuthorException;

// author entity
// id , name, email , password
// 생성장에서 초기화, getter 로만 구성

public class Author {
    private int id;
    private String name;
    private String email;
    private String password;

    public Author(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

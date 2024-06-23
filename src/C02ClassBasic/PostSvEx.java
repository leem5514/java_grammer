package C02ClassBasic;

import java.util.*;
import java.util.regex.Pattern;

public class PostSvEx {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("서비스 번호를 입력하세요 1. 회원가입, 2. 회원 목록조회, 3. 회원 상세조회, 4.게시글 작성, 5. 게시글 목록조회, 6.게시글 상세 조회");
            int number = Integer.parseInt(sc.nextLine());

            if (number == 1) {
                System.out.println("회원가입하실 이름을 입력하세요 : ");
                String name = sc.nextLine();
                System.out.println("회원가입하실 이메일을 입력하세요 : ");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력하세요 :");
                String passwd = sc.nextLine();
                User.register(name, email, passwd);
            }
            else if (number == 2) {
                User.userDisplay();
            }

            else if (number == 3) {
                System.out.println("회원 ID을 입력하세요:");
                Long id = sc.nextLong();
                User.userDetail(id);

            }
            else if (number == 4) {
                System.out.println("게시물 제목을 입력하세요:");
                String title = sc.nextLine();
                System.out.println("게시물 내용을 입력하세요:");
                String content = sc.nextLine();
                System.out.println("유저 번호를 입력하세요 : ");
                Long userId = Long.parseLong(sc.nextLine());
                Post.writePost(title, content, userId);
            }
            else if (number == 5) {
                Post.postDisplay();
            }
            else if (number == 6) {
                System.out.print("조회할 게시물ID: ");
                Long id = Long.parseLong(sc.nextLine());
                Post.PostDetail(id);
            }
            else if (number == 00) {
                System.out.println("종료하겠습니다 . BYE BYE");
                break;
            }
        }
    }
}
class User {
    static Map<Long, User> users = new TreeMap<>();
    private String name;
    private String email;
    private String passwd;
    private static long static_id = 0L;
    private Long id;

    public User(String name, String email, String passwd) {
        this.id = ++static_id;
        this.name = name;
        this.email = email;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswd() {
        return passwd;
    }

    public Long getId() {
        return id;
    }

    public static void register (String name, String email, String passwd){
        if (passwd.length() < 8) {
            System.out.println("비밀번호는 8자 이상이어야 합니다.");
            return;
        }
        if (!Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", email)) {
            System.out.println("이메일 형식에 맞추어 사용해야합니다.");
            return;
        }
        users.put(static_id, new User(name, email, passwd));
        System.out.println("회원 가입이 완료되었습니다." + name + "님 환영합니다");
    }
    public static void userDisplay() {
        for (User user : users.values()) {
            System.out.println("ID: " + user.getId() + "\tEmail: " + user.getEmail());
        }
    }
    public static void userDetail(Long id) {
        User user = users.get(id);
        if(user != null) {
            System.out.println("ID: " + id + "\tName: " + user.name + "\tEmail: " + user.email + "\tPassword: " + user.passwd);
            return;
        }
        else {
            System.out.println("존재하지 않는 회원입니다.");
        }
    }
}
class Post {
    static Map<Long, Post> posts = new TreeMap<>();
    private String title;
    private String content;
    private User user;
    private static Long static_id = 0L;
    private Long id;

    public Post(String title, String content, User user) {
        this.id = ++static_id;
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return id;
    }

    public static void writePost(String title, String content, Long userId) {
        for(User u : User.users.values()){
            System.out.println(u.getId());
            System.out.println(u.getEmail());
        }
        User user = User.users.get(userId);
        if (user == null) {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }
        posts.put(static_id, new Post(title, content, user));
        System.out.println("게시물이 성공적으로 업로드 되었습니다.");
    }

    public static void postDisplay() {
        for (Post p : posts.values()) {
            System.out.println("ID: " + p.getId() + "\tTitle: " + p.getTitle());
        }
    }
    public static void PostDetail(Long id) {
        Post post = posts.get(id);
        if(post != null) {
            System.out.println("ID: " + id + "\tTitle: " + post.title + "\tContent: " + post.content + "\nUser: " + post.user.getName());
            return;
        }
        else {
            System.out.println("게시물이 없습니다.");
        }
    }
}





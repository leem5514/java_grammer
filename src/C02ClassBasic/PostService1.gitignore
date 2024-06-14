//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class C0207BoardService {
//    public static void main(String[] args) {
//        ArrayList<User> users = new ArrayList<>();
//        ArrayList<Board> boards = new ArrayList<>();
//        ArrayList<Post> posts = new ArrayList<>();
//        Board board = new Board();
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            userManagement userManagement = new userManagement(users);
//            System.out.println("서비스 번호를 입력하세요 1. 회원가입, 2. 회원 목록조회, 3. 회원 상세조회, 4.게시글 작성, 5. 게시글 목록조회, 게시글 상세 조회");
//            int number = Integer.parseInt(sc.nextLine());
//            if (number == 1) {
//                System.out.println("사용자 이메일을 입력하세요:");
//                String email = sc.nextLine();
//                System.out.println("사용자 이름을 입력하세요");
//                String name = sc.nextLine();
//                System.out.println("비밀번호를 입력하세요:");
//                String password = sc.nextLine();
//                userManagement.register(email, name, password);
//            }
//            else if (number == 2) {
//
//            }
//
//            else if (number == 3) {
//                System.out.println("회원 아이디을 입력하세요:");
//                Long userId = Long.parseLong(sc.nextLine());
//                userManagement.findUserById(userId, email, name, password);
//            }
//            else if (number == 4) {
//                Long id = Long.parseLong(sc.nextLine());
//                System.out.println("게시물 제목을 입력하세요:");
//                String title = sc.nextLine();
//                System.out.println("게시물 내용을 입력하세요:");
//                String content = sc.nextLine();
//                board.addPost(id, title, content);
//
//            }
//            else if (number == 5) {
//                for (Post post : posts) {
//                    System.out.println(post.getId());
//                    System.out.println(post.getTitle());
//                }
//            }
//            else if (number == 6) {
//                board.displayPosts();
//            }
//        }
//    }
//}
//class User {
//    static Long static_id; // auto_increment을 구현하는 용도
//    private Long userId;
//    private String name;
//    private String email;
//    private String password;
//
//    public User(String name, String email, String password) {
//        static_id += 1; // 생성자 메서드가 호출될 때 마다 +1;
//        userId = static_id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//}
//class userManagement {
//    private List<User> users;
//
//    public userManagement(List<User> users) {
//        this.users = users;
//    }
//
//    public void register(String email, String name, String password) {
//        for (User user : users) {
//            if (user.getEmail().equals(email)) {
//                System.out.println("이미 존재하는 사용자 ID입니다.");
//                return;
//            }
//        }
//        users.add(new User(email, name, password));
//        System.out.println("회원가입이 완료되었습니다.");
//    }
//
//    public User findUserById(Long userId, String email, String name, String password) {
//        for (User user : users) {
//            if (user.getUserId().equals(userId)) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//}
//class Post {
//    private Long id;
//    private String title;
//    private String content;
//    private User email;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public User getEmail() {
//        return email;
//    }
//
//    public Post(Long id, String title, String content, User email) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.email = email;
//
//    }
//}
//class Board {
//    private List<Post> posts;
//
//    public Board() {
//        posts = new ArrayList<>();
//    }
//
//    public void addPost(Long id, String title, String content, User email) {
//        posts.add(new Post(id, title, content, email));
//    }
//    public void postList (Long id, String title) {
//
//    }
//    public void displayPosts() {
//        for (Post post : posts) {
//            System.out.println("작성자: " + post.getEmail());
//            System.out.println("제목: " + post.getTitle());
//            System.out.println("내용: " + post.getContent());
//        }
//    }
//}
//
//
//
//

package C07ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.Scanner;

// AuthorService service = new AuthorService();
// 실제 비즈니스 로직은 서비스에게 맞기기
// 컨트롤러는 while(true)
// 1) 회원가입 -> name, email, password 입력  -> 객체 생성 후 service 의 reigister 메서드 호출 -> service에서 author 객체 생성 -> repository호출 register완료(list 담기)
// 1-1. 회원가입 예외처리 => service에서는 throw new 발생, controller try catch(동일 이메일 있는경우 , 비밀번호가 5자리 이하인 경우 등.)
// 2) 로그인 : email, password 입력받아 service 의 login 메서드 호출 -> service에서 해당 email user가 있는지 검증(없으면 예외.)
public class AuthorController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthorService authorService = new AuthorService();
        while (true) {
            System.out.println("1.회원가입, 2. 로그인");
            System.out.print("번호: ");
            int num = sc.nextInt();
            if (num == 1) {
                try {
                    System.out.print("Author Name: ");
                    String name = sc.nextLine();
                    System.out.print("Author Email: ");
                    String email = sc.nextLine();
                    System.out.print("Author Password: ");
                    String password = sc.nextLine();
                    authorService.register(name, email, password);

                } catch (NullPointerException e) {
                    System.out.println("빈 값은 사용하실 수 없으십니다.");
                } catch (IllegalArgumentException e) {
                    e.getMessage();
                }
            }
            if (num == 2) {
                try {
                    System.out.print("Author Email: ");
                    String email = sc.nextLine();
                    System.out.print("Author Password: ");
                    String password = sc.nextLine();
                    authorService.login(email, password);

                } catch (NullPointerException e) {
                    System.out.println("빈 값은 사용하실 수 없으십니다.");
                } catch (IllegalArgumentException e) {
                    e.getMessage();
                }
            }
        }
    }
}



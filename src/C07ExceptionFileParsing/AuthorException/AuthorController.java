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
        AuthorRepository authorRepository = new AuthorRepository();
        AuthorService authorService = new AuthorService(authorRepository);
        while (true) {
            System.out.println("1.회원가입, 2. 로그인 3. 회원정보 조회");
            System.out.print("번호: ");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                try {
                    System.out.print("Author Name: ");
                    String name = sc.nextLine();
                    System.out.print("Author Email: ");
                    String email = sc.nextLine();
                    System.out.print("Author Password: ");
                    String password = sc.nextLine();
                    authorService.register(name, email, password);
                    System.out.println("회원가입이 성공적으로 완료되었습니다. 환영합니다, " + name + "님!");
                } catch (NullPointerException e) {
                    System.out.println("빈 값은 사용하실 수 없으십니다.");
                } catch (Exception e) {
                    System.out.println("회원가입 실패: " + e.getMessage());
                }
            }
            if (num == 2) {
                try {
                    System.out.print("Author Email: ");
                    String email = sc.nextLine();
                    System.out.print("Author Password: ");
                    String password = sc.nextLine();
                    Author author = authorService.login(email, password);
                    System.out.println("로그인 성공. 환영합니다, " + author.getName() + "님!");
                } catch (NullPointerException e) {
                    System.out.println("빈 값은 사용하실 수 없으십니다.");
                } catch (Exception e) {
                    System.out.println("로그인 실패: " + e.getMessage());
                }
            }
            else if (num == 3) {
                try {
                    System.out.print("조회할 Author Email: ");
                    String email = sc.nextLine();
                    Author author = authorService.findByEmail(email);
                    System.out.println("회원 조회 성공. 사용자 정보: ");
                    System.out.println("ID: " + author.getId());
                    System.out.println("Name: " + author.getName());
                    System.out.println("Email: " + author.getEmail());
                } catch (Exception e) {
                    System.out.println("회원 조회 실패: " + e.getMessage());
                }
            } else {
                if(num == 0) {
                    System.out.println("₍₍ ◝(˙꒳\u200B˙◝) ⁾⁾");
                    System.out.println("₍₍ (◟˙꒳\u200B˙)◟ ⁾⁾");
                    break;
                }
            }
        }
    }
}


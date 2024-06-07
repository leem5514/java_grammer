package C01Basic;

import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
//      도어락키 if문
//        Scanner sc = new Scanner(System.in);
//        int answer = 1234;
//        int input = sc.nextInt();
//        if(input == answer) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호 오류");
//        }
//        String result = (answer == input) ? "문이열렸습니다" : "비밀번호가 틀렸습니다";

//
//        3. 비밀번호를 맞추면 종료. break;
//        4. 비밀번호가 5회 이상 틀리면 종료 : 입력횟수를 초과하였습니다.
//        Scanner sc = new Scanner(System.in);
//        int a =0;
//        while (true) {

//            String answer = "1234";
//            String input = sc.nextLine();
//        if(answer.equals(input)) {
//            System.out.println("문이 열렸습니다.");
//            break;
//        } else {
//            System.out.println("비밀번호 오류");
//              a++;
//        } else if(a == 5) {
//        System.out.println("비밀번호 5회 오류");
//    }

//        알파벳이 소문자인지 대문자인지 판별 프로그램
//        소문자 1글자 입력시 소문자입니다.
//        대문자 1글자 입력시 대문자입니다.
//        그 외 문자 입력시 알파벳이 아닙니다.
//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//
//        if((int)c >= 65 && (int)c <= 90) {
//            System.out.println("대문자입니다");
//        } else if((int)c >96 && (int)c <120) {
//            System.out.println("소문자입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }

//        택시 요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
//        Scanner sc = new Scanner(System.in);
//        int price = sc.nextInt();
//
//        if(price >= 10000) {
//            System.out.println("택시타~");
//        } else if (price >= 3000 && price < 10000) {
//            System.out.println("버스타");
//        } else if (price >= 2000 && price < 3000) {
//            System.out.println("킥보드 타");
//        } else {
//            System.out.println("걸어가");
//        }

//        switch문 : if else if 문을 가독성 있게 표현 구문
//        System.out.println("원하는 서비스 번호를 입력하세요");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        switch (input) {
//            case 1:
//                System.out.println("대출업무입니다");
//                break;
//            case 2:
//                System.out.println("예금업무입니다");
//                break;
//            case 3:
//                System.out.println("적금업무입니다");
//                break;
//            case 4:
//                System.out.println("상담사 연결입니다");
//                break;
//            default:
//                System.out.println("잘못 입력하셨습니다");
//                break;
//        }
    }
}

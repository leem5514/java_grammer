package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
////        출력 : System.out(console 출력)
//        int a = 20;
////        println : 출력후 줄바꿈
////        print : 출력후 줄바꿈x
//        System.out.print(a);
//        String b = "Hello World";
//        System.out.println(b);
////        문자열과 숫자열을 합치면 문자가 됨
//        System.out.println(a+b);
//
////        입력 : System.in(키보드입력) + Scanner(입력을 위한 클래스)
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
////        nextLine은 입력받은 데이터를 한 줄 읽어서, String 리턴
//        String inputs = sc.nextLine();
//        System.out.println(inputs);

//        System.out.println("더하기를 할 두 숫자를 입력해주세요");
//        int a1 =  sc.nextInt();
//        int a2 =  sc.nextInt();
//        System.out.println("두 수를 더한 값은 " + (a1 + a2) + "입니다.");

//        System.out.println("실수를 입력해주세오");
//        double input_double = sc.nextDouble();
//        System.out.println(input_double);

//        System.out.println("true/false 값을 입력하세요");
//        boolean input_boolean = sc.nextBoolean();
//        System.out.println(input_boolean);

        // java 밖의 시스템이므로 입출력 시스템 메모리 해제 해주는 것이 좋다.
        sc.close();
    }
}

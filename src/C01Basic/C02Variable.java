package C01Basic;

import java.math.BigDecimal;
import java.util.Scanner;

public class C02Variable {
    public static void main(String[] args) {
//        정수 : byte(1바이트), int(4바이트), long(8바이트)
        byte a = 127;
        byte b = -128;

//        오버플로우 또는 언더플로우 발생
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

//        int int_a = 10;
//        long 명시적으로 L을 붙여 long 타입임을 명시해야함
//        long long_a = 20L;
//        실수 : float, double(기본)
//        float f1 = 1.123f;
//        double d1 = 1.123;

//        부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);

//        double total = 0;
//        for(int i = 0; i<1000; i++) {
//            total += 0.1;
//        }
//        System.out.println(total/10);
//      소숫점 오차의 대안으로 Bigdecimal 클래스 사용
//        double d1 = 1.02;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
////        Bigdecimal의 원리 : 저장시 문자열로 저장해서, 연산할 때 정수로 변화, 최종결과 실수 반환
//        BigDecimal b1 = new BigDecimal("1.03");
//        BigDecimal b2 = new BigDecimal("0.42");
//        double result = b1.subtract(b2).doubleValue();
//        System.out.print(result);
// 문자형은 char
//        char m1 = '가';
//        System.out.println(m1);
//
////        boolean : true / false
//        boolean bool1 = ture;
//        boolean bool2 = false;
//        Scanner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
////        if조건절 안에 boolean 타입값이 들어옴에 유ㅢ
//        if{input1 > 0){
//            System.out.println("입력값이 0보다 클빈다");
//        }

////        타입변화
////         묵시적 타입변환
//            char ch1 = 'a';
//            char ch1_num 'ch2';
////        알파벳 비교를 윈한 묵시적 타입변환 발생
//        System.out.println(ch1_num);




//        int -> double 가능
//        int i1 = 10;
//        double d1 = i1;
//        System.out.println(d1);
//
//        double d2 = 10.5;
//        int i2 = (int) d2;
//        System.out.println(i2);
//
//        //명시적 타입변환
//        System.out.println((int)'b');
//
////        형변환 관련 나눗셈 문제
//        int a = 1;
//        int b =4;
//        int c = 1/4;
//        double d = 1/4;
////          int/int 이므로 결과값을 int로 판단형 소숫점 절사
////          두 값 중에 한 값만이라도 double로 명시적 형변환 시켜주면 결과값이 double
//        System.out.println(c);
//        System.out.println(d);
//
////        변수와 상수
////        상수는 초기화 이후 값이 재할당되는것이 불가능
//        int a1 =10;
//        a1 = 20;
//        System.out.println(a1);
//
////        상수는 조기화 이후 값이 재 할당 불가능
////        상수는 final 키워드를 통해 표현
//        final int AGES = 20;
//        AGES = 30;
    }
}

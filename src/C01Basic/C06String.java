package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        // 참조자료형 : 기본 자료형을 제외한 모든 자료형
//        // WrapperClass : 기본형 타입을 Wrapping한 클래스
//        // int 와 Integer 간 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        // 오토 언박싱 : Integer -> int 형변환
//        int c = b;
//
//        // 오토 박싱
//        Integer d = a;

//        // String 과 int의 형변환
//        int a = 10;
//        // int -> String
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//        // String -> int
//        int b = Integer.parseInt(st1);

//        // 참조 자료형의 원시 자료형을 닮을 때는 Wrapper 클래스를 써야한다.
//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

            // 24.06.07
            // 6.참조자료형 시작
//        /* String 변수 생성 방법 */
//        // 객체 생성
//        String st1 = new String("hello");

//        /* 리터럴 방식 : 권장 방식 */
//        /* 문자열 pool 을 통해서 성능 향상 도모 */
//        String st2 = "hello";
//        String st3 = new String("hello");
//        String st4 = "hello";
//        System.out.println(st1==st3); //f
//        System.out.println(st2==st4); //t
//        System.out.println(st3==st4); //f

//        // String 문자열 비교는 equals 사용 권장
//        System.out.println(st1.equals(st3)); //t
//        System.out.println(st2.equals(st4)); //t
//        System.out.println(st3.equals(st4)); //t
//        /* 대소문자 구분x => equalsIgnoreCase */
//        System.out.println("hello".equals("hellO")); //f
//        System.out.println("hello".equalsIgnoreCase("hello")); //t
//
//        /* 문자열길이 : length(); */
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//        /* indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 */
//        int index1 = st1.indexOf("java");
//        System.out.println(index1);
//        System.out.println(st1.lastIndexOf("java")); // 마지막 문자열의 index 위치
//
//        System.out.println(st1.contains("hello")); //t
//        System.out.println(st1.contains("world")); //f
//
//        /* charAt : 특정 index의 문자(char) 값 리턴 */
//        String st = "abcdefabaadf";
//        char ch1 = st.charAt(0);
//        System.out.println(ch1);
//        // 위 문자열의 a의 개수가 몇개인지 count;
//        int count = 0;
//        for(int i = 0; i < st.length(); i++) {
//            if(st.charAt(i) == 'a') {
//                count ++;
//            }
//        }
//        System.out.println(count);

//        // toCharArray() : String 문자열을 char 배열로 리턴
//        System.out.println(Arrays.toString(st.toCharArray())); // 형식

//        /* to CharArray을 활용해서 a 가 몇개인지 count, 향상된 for 문 사용 */
//        int count = 0;
//        char[] arr = st.toCharArray();
//        for(int a : arr) {
//            if (a =='a') {
//                count ++;
//            }
//        }
//        System.out.println(count);

//        // 문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += " world";

//        //(실습) 프로그래머스 - 특정 문자 제거하기
//        String my_String="abcdef";
//        String letter="f";
//        String answer = "";
//        for(int i=1;i<my_String.length();i++) {
//            if(my_String.charAt(i)!=letter.charAt(0)) {
//                answer += my_String.charAt(i);
//            }
//        }
//        System.out.println(answer);


//        /* substring(a,b) : a이상  b 미만의 index의 문자를 잘라 리턴 */
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5)); // hello
//        System.out.println(st1.substring(6,st1.length())); // world


//        String my_string="abcdef";
//        String letter="f";
//        String answer = "";
//        for (int i = 0 ; i < my_string.length(); i++) {
//            if(my_string.substring(i,i+1).equals(letter)) {
//                answer += my_string.substring(i,i+1);
//            }
//        }
//        System.out.println(answer);


//        // (실습) 프로그래머스 -  가운데 글자 가져오기
//        String s = "abcde";
//        //String s = "qwer";
//        String answer = "";
//        if( s.length() % 2 == 0) {
//            answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
//        } else {
//            answer = s.substring(s.length()/2, s.length()/2 + 1);
//        }
//        System.out.println(answer);
//        //return answer;

//        /* trim, strip : 문자열 양쪽 끝의 공백 제거 */
//        String trimSt1 = " hello world  ";
//        //String trimSt2 = trimSt1.trim();
//        String trimSt2 = trimSt1.strip();
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);

//        /* toUppercase : 대문자로 변환, toLowercase : 소문자로 변환 */
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

//        /* char -> String 형변환 */
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        System.out.println(st1);

//        /* replace(a,b) : a문자열을 b문자열로 대체 */
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

//        /* replaceAll(a,b) : replace와 동일하지만, 정규표현식을 쓸 수 있음. */
//        String st1 = "01abc123한글123"; // 숫자, 한굴, 알파벳 등의 여러 문자가 섞여 있을 때

//        // for문을 활용해서 알파벳(소문자) 제거 answer return
//        String answer = "";
//        for (int i = 0; i < st1.length(); i++) {
//            if(!(st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z')) {
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        // replaceAll 과 정규 표현식 리턴
//        String st1 = "01abc123ABC한글123";
//        // [a-z]+ : 한개 이상의 소문자 알파벳 표현 정규 표현식
//        // [A-Za-z]+ : 대소문자 포함
//        // [가-힣]+ : 한글
//        // [0-9]+ : 숫자
//        String answer = st1.replaceAll("[A-Za-z]+","");
//        System.out.println(answer);

//        /* String의 matches와 Pattern.matches() */
//        String test = "helloA";
//        System.out.println(test.matches("[a-z]+")); //f
//        System.out.println(test.matches("[A-Za-z]+")); //t
//
//        boolean b1 = Pattern.matches("[0-9]","12345");
//        System.out.println(b1); //t
//        boolean b2 = Pattern.matches("[0-9]","12345hello");
//        System.out.println(b2); //f

//        // ^ : 정규 표현식의 시작 , $ : 정규표현식 끝, * : 빈 값 포함
//        boolean b3 = Pattern.matches("^[A-Za-z]*$", "");
//        System.out.println(b3);


//        // (실습) 프로그래머스 -  문자열 다루기
//        boolean answer = false;
//        String s = "a234";
//        if((s.length()== 4 || s.length()== 6) && s.matches("[0-9]+")){
//            answer = true;
//        }
//        //return answer;

//        // 전화번호 패턴 검증
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//            if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)){
//                System.out.println("올바르게 입력하셨습니다.");
//            } else {
//                System.out.println("틀린 형식의 전화번호 입니다");
//            }
//        }

//        // 이메일 검증 : 소문자알파벳과+숫자로@알파벳.com
//        String email = "abc2@naver.com";
//        boolean b4 = Pattern.matches("^[a-z0-9]+@+[a-z]+.com$", email);
//        System.out.println(b4);

//        /* split : 특정 문자를 기준으로 문자열을 자르는 것. 문자열 배열을 return */
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println(Arrays.toString(a_arr));

//        String b = "a b c  d";
//            // \s : 공백 의미
//        String[] b_arr = b.split("\\s+");
//        System.out.println(Arrays.toString(b_arr));

//        /* isEmpty와 null(자료타입) */
//        String st1 = null;
//        String st2 = "";
//        // equal관계 아님
//        System.out.println(st1==st2);
//        // 문제발생x
//        System.out.println(st2.isEmpty());  //t
//        // 문제발생 o : NullPointer Exception 예외 발생
////        System.out.println(st1.isEmpty());  //f
//        if(st1 != null) {
//            System.out.println(st1.isEmpty());
//        }

//        /* join : String[]을 하나의 String 만드는 메서드 */
//        String[] arr = {"java", "python", "C++", "javascript"};
//        String st = String.join(" ", arr);
//        System.out.println(st);

//        /* StringBuffer */
//        StringBuffer sb1 = new StringBuffer("hello");
//        // append : 문자열 가장 뒤에 다른 문자열 더하는 것
//        sb1.append(" java");
//        sb1.append(" world");
//        String answer = sb1.toString();
//        sb1.insert(5, " python");
//        sb1.delete(17, sb1.length());
//        System.out.println(sb1);

//        /* StringBuilder */
//        // String += < StringBuffer < StringBuilder
//        // StringBuilder은 스레드 safe X
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n"); //줄바꿈
//        sb2.append("world");
//        sb2.append("\n");
//
//        System.out.println(sb2);

//        // StringBuilder을 사용해서
//        String answer = "";
//        String my_string = "hello";
//        int n = 3; //hhheeelllllooo 결과가 answer에 담기도록
//        StringBuffer sb3 = new StringBuffer(my_string);
//        for(int i =0; i<my_string.length(); i++){
//            char temp = my_string.charAt(i);
//            for(int j =0; j<n; j++) {
//                sb3.append(temp);
//            }
//        }
//        System.out.println(sb3);


//        // (실습) 프로그래머스 -  문자열 밀기
//        String A;
//        String B;
//        int answer = 0;
//        String copy = A;
//
//        for (int i = 0; i < A.length(); i++) {
//            if (copy.equals(B)) {
//                return answer;
//            }
//            String a = copy.substring(copy.length() - 1);
//            copy = a + copy.substring(0, copy.length() - 1);
//            answer++;
//       }
//       return -1;


    }
}
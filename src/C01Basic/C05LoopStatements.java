package C01Basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        int a = 1;
////        while (a<11) {
////            a++;
////            System.out.println(a);
////        }
////        입력한 숫자의 구구단 단수 출력
//        int n = sc.nextInt();
//        for(int i = 1; i < 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }

//        int num = 1234;
//        int result = 0;
//        result에 숫자 num을 반대로 뒤집은 숫자값을 넣어주세요.
//        int thousand = 1234 / 1000;
//        int hundred = (1234 % 1000) / 100;
//        int ten = ((1234 % 1000) % 100) / 10;
//        int one = (((1234 % 1000) % 100) % 10);
//        result = one * 1000 + ten * 100 + hundred * 10 + thousand;

//        System.out.println(result);


        // do while : 무조건 1번은 실행되는 반복문
//        int a = 100;
//        do {
//            a++;
//            System.out.println(a);
//        } while (a<10);

//        2부터 10까지 출력을 for문을 활용해서 출력
//        for(int i = 2 ; i < 11; i++) {
//            System.out.print(i + " ");
//        }

//        1에서 10중에 홀수 출력
//        for (int i = 0; i < 11; i++) {
//            if( i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        1부터 20까지 수중에 짝수를 모두 더한 값
//        int sum = 0;
//        for (int i = 1 ; i <= 20; i++) {
//            if(i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.print(sum);

//        최대공약수 구하기(1)

        // 최대공약수 구하기(2)
//        int a = 24; int b=36;
//        int gcd = gcd(a,b);
//        System.out.println(gcd);

//        소수구하기

//
//        boolean loop = true;
//        for (int i = 0; i < input; i++) {
//            if (input % i == 0) {
//                loop = true;
//                break;
//            }
//        }
//        if (loop) {
//            System.out.println("소수");
//        }
//        int input = sc.nextInt();
//        int count =0;
//        for (int i = 0; i < 24; i++) {
//            for (int j = 2; j < i; j++) {
//                if(i % j == 0) {
//                    count ++;
//                }
//            }
//            if(count == 2) {
//                System.out.print("소수");
//            }
//        }
//        1에서 10중에 홀수 출력(continue 버젼)
//        for (int i = 1; i <= 10; i++) {
//            if( i % 2 == 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

////        배열과 enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1, 3, 5, 7, 9};
////        일반 for문의 경우
////        일반 for 문을 통한 arr 값 변경 후 출력
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
////        향상 for문 : 반복 횟수는 arr에 들어간 데이터 개수 만큼 반복
//        for(int i : arr) {
//            System.out.println(i);
//        }
//
//        System.out.println(Arrays.toString(arr)); // arr만 할경우 -> 주소 출력 ,arrays.tostring(arr) 할경우 내용출력
////        향상된 for 문을 통한 arr 값 변경 후 출력
////        향상된 for 문으로는 실제 arr 값의 변경 불가
//        for(int i : arr) {
//            i += 10;
//        }
//        자바 변수의 유요 범위 : {}
//        int num = 10;
//        if(num > 1) {
//            int abc = 20;
//            num = 20;
//        }
        //abc=30, if문 중괄호 밖에서는 abc 변수의 존재를 모름
//        System.out.println(num);
//        System.out.println(abc);
//      다중반복문


//        for (int i = 2; i <= 9; i++) {
//            System.out.println(i + "단");
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println();
//        }
//
////        라벨문
//        loop1 :
//        for(int i = 1; i <= 5; i++){
//            boolean test = false;
//            for(int j = 0; j < 5; j++) {
//                System.out.println("Hello World");
//                if(j == 2) {
//                    test =true;
//                    break loop1;
//                }
//            }
//        }

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
//        System.out.println(arr[2][0]);
        int target = 11;
        for (int i = 0; i < 4; i++) {
            boolean test = false;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == target) {
                    System.out.println(i + "," + j);
                    test = true;
                    break;
                }
            }


        }

//    }
//    public static int gcd(int x, int y){
//        if(y == 0){
//            return x;
//        } else {
//            return gcd(y, x%y);
//        }
//    }

    }
}

package C02ClassBasic;

import java.util.Scanner;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
//        //for문으로 1~10 누적 합
//        int sum = 0;
//        for(int n = 1; n <= 10; n++) {
//            sum += n;
//        }
//        System.out.println(sum);
//        System.out.println(addAcc(10));

        //피보나치 수열
        int[] arr =new int[10];
        int first = 1;
        int second = 1;
        for(int i = 2; i<10; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            second = arr[i];
        }
        System.out.println(second);

        System.out.println(fibonacci(5));

    }
    static int fibonacci(int a) {
        if(a<=2) return 1;
        return fibonacci(a-1) + fibonacci(a-2);
    }

//    static int addAcc(int n){
//        if(n == 0) {
//            return 1;
//        }
//        return n+addAcc(n-1);
//    }
}

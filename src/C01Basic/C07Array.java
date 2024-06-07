package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        /* 배열 표현식1: 리터럴 방식 */
//        int[] intArr1= {1,2,3,4,5};
//
//        /* 배열 표현식2 : 선언 후 할당 방식 */
//        int[] intArr2= new int[5];
//        intArr2[0]= 1;
//        intArr2[1]= 2;
//        intArr2[2]= 3;
//        intArr2[3]= 4;
//        System.out.println(intArr2[4]); // 0 으로 초기화
//
//        String[] charArr = new String[10];
//        System.out.println(charArr[0]); // null 으로 초기화
//
//        for(int i =0; i<intArr2.length; i++){
//            System.out.println(intArr2[i]);
//        }
//        /* 배열 표현식3 */
//        int[] intArr3 = new int[]{1,2,3,4};
//
//        /* 배열 표현식4 : 불가능 -> 배열의 길이는 사전에 지정되어야 함 */
//        int[] intArr4 = new int[];

//        String[] stArr = new String[5];
//        stArr[0] = "hello";
//        stArr[1] = "java";
//        // null pointer exception
//        System.out.println(stArr[2].length()); // 예외 발생
//
//        String[] stArr2 = new String[5];
//        // 배열의 값 한꺼번에 세팅하는 메서드
//        Arrays.fill(stArr2, "");
//        System.out.println(stArr[3]);

//        // 85, 65 ,90인 int 배열을 선언하고, 총합, 평균을 구하시오
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        int avg = 0;
//        for(int i= 0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        avg = sum/arr.length;
//        System.out.println(sum);
//        System.out.println(avg);

//        // 배열의 최대값, 최소값 구하기
//        int[] arr = {10,20,30,12,8,17};
//        int Max = arr[0];    // Integer.MIN_VALUE 세팅 가능
//        int Min = arr[0];    // Integer.MAX_VALUE 세팅 가능
//        for (int i = 1; i < arr.length; i++) {
//            if(Max < arr[i]) {
//                Max = arr[i];
//            }
//            if(Min > arr[i]) {
//                Min = arr[i];
//            }
//        }
//        System.out.println(Max);
//        System.out.println(Min);

//        // 배열의 순서 바꾸기
//        int[] arr ={10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        // 0번쨰 index 부터 마지막 index까지 순차적으로 자리 change
//        int[] arr = {10, 20, 30, 40 ,50};
//        for(int i = 0 ; i < arr.length-1; i++) {
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        // 배열뒤집기
//        int[] arr = {1,2,3,4,5};
//        int[] newArr = new int[arr.length];
//        int num = arr.length;
//        for(int i = 0 ; i < arr.length; i++){
//            newArr[num - i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));


//        //숫자 뒤집기
//        // int num = 1234;
//        // 문자열 -> 문자배열로 만들고 -> 문자열과 관련된 풀이로 풀기
//        int num = 1234;
//        String Arrstr = Integer.toString(num);
//        StringBuilder sb = new StringBuilder(Arrstr);
//        int count = Arrstr.length();
//        for(int i = 0; i < Arrstr.length(); i++) {
//            sb.append(Arrstr.charAt(count-i-1));
//        }
//        System.out.println(sb);

//        /* 정렬 */
//
//        /* 오름차순 */
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        /* 문자정렬 */
//        // 문자 정렬은 아스키 코드 기준 정렬 -> 대문자가 소문자보다 숫자가 더 낮다.
//        String[] fruits = {"banana", "apple", "orange", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        // 문자열의 INDEX 순서로 비교
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2)); // apple1, apple11, apple2 순서로 출력

//        /* 내림차순 */
//        String[] st_arr = {"hello", "hi", "bye", "goodMorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));

        // 기본형 타입은 Comparator으로 처리 불가능
        int[] intArr = {5,1,2,7,3,1,2};
        //Arrays.sort(intArr, Comparator.reverseOrder()); // -> 오류 발생 int는 참조형 변수가 아니므로 오류 발생
        Arrays.sort(intArr);
        // 방법 1. 오름차순 정렬 이후 배열 뒤집기 진행!
        // 방법 2. streamApi, lambda을 활용한 내림차순 정렬
        int[] answer = Arrays.stream(intArr) // intArr 을 대상으로 Stream 객체 생성
                .boxed() //int 요소를 Integer으로 형변환 시키는 메서드
                .sorted(Comparator.reverseOrder())
                .mapToInt(a->a) // Integer을 다시 int으로 형변환
                .toArray(); // 배열로 변환

    }

}

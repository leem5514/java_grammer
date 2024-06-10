package C01Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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

//        // 기본형 타입은 Comparator으로 처리 불가능
//        int[] intArr = {5,1,2,7,3,1,2};
//        //Arrays.sort(intArr, Comparator.reverseOrder()); // -> 오류 발생 int는 참조형 변수가 아니므로 오류 발생
//        Arrays.sort(intArr);
//        // 방법 1. 오름차순 정렬 이후 배열 뒤집기 진행!
//        // 방법 2. streamApi, lambda을 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(intArr) // intArr 을 대상으로 Stream 객체 생성
//                .boxed() //int 요소를 Integer으로 형변환 시키는 메서드
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(a->a) // Integer을 다시 int으로 형변환
//                .toArray(); // 배열로 변환



//        Scanner sc = new Scanner(System.in);
//        int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
//
//        int[] commands = new int[3];
//        for(int i = 0; i < 3; i++) {
//            commands[i] = sc.nextInt();
//        }
//        int[] array_commands = new int[commands[1]-commands[0]];
//        for(int i = 0; i < commands[1]-commands[0]; i++) {
//            array_commands[i] = array[commands[0]+i];
//        }
//        Arrays.sort(array_commands);
//        int answer = array_commands[2];
//        System.out.println(answer);

//        int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for(int i = 0; i < commands.length; i++) {
//            int start = commands[i][0];
//            int end = commands[i][1];
//            int value = commands[i][2]-1;
//            int[] temp = new int[end-start];
//            int count = 0;
//            for(int j=start; j<end; j++) {
//                temp[count] = array[j];
//                count++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[count];
//        }
//        System.out.println(Arrays.toString(answer));

        /* 선택정렬, 버블정렬 */
//        int[] arr = {17,20,19,25,12};
//
//        for(int i = 0; i < arr.length; i++) {
//            int minValue = arr[i];
//            int index = i;
//            for(int j = i+1 ; j< arr.length; j++) {
//                if(arr[j] < minValue) {
//                    minValue = arr[j];
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // 숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때, 만들 수 있는 2가지 조합의 합을 출력

//        int[] intArr = {10,20,30,40,50,60};
//        for(int i = 0; i < intArr.length; i++) {
//            for (int j = i+1; j < intArr.length; j++) {
//                System.out.println(intArr[i] + intArr[j]);
//            }
//        }

//        /* 배열의 복사 */
//        // copyOf(배열, length), copyOfRange(배열, start, end) -> * 남은 자리는 0으로 채워짐
//        int[] arr = {10,20,30,40,50};
//        int[] newArr1 = Arrays.copyOf(arr, 10);
//        int[] newArr2 = Arrays.copyOfRange(arr, 1,4);
//        System.out.println(Arrays.toString(newArr1));
//        System.out.println(Arrays.toString(newArr2));

        // 배열의 중복 제거

//        int[] temp = {10,10,5,7,40,40,10,10};
//        Arrays.sort(temp);
//        // 5, 7, 10, 10, 10, 10 ,40 ,40
//        //list, set 쓰지 말고 중복제거
//        int[] arr = new int[temp.length];
//        int num = 0;
//        for(int i = 0 ; i < temp.length ; i++){
//            if(i==0 || temp[i] != temp[i-1]) {
//                arr[i] = temp[i];
//                num++;
//            }
//        }
//        System.out.print(Arrays.toString(arr));
//        int[] answer = Arrays.copyOfRange(arr, 0,num);

//        // (실습) 프로그래머스 - 두개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1};
//
//        int[] temp = new int[numbers.length*numbers.length];
//        int count = 0;
//        for(int i = 0; i < temp.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                temp[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//        int[] newTemp = Arrays.copyOf(temp, temp.length);
//        Arrays.sort(temp);
//        int num = 0;
//        for(int k = 0 ; k < newTemp.length; k++) {
//            if(k == 0 || newTemp[k] != newTemp[k-1]) {
//                newTemp[num] = temp[k];
//                num++;
//            }
//        }
//        int[] answer = Arrays.copyOf(newTemp, num);
//        System.out.println(Arrays.toString(answer));


//        // 배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int num = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 8) {
//                num = i;
//                break;
//            }
//        }
//        System.out.println(num);
//        /* 이진검색(Binary Search) - 이분탐색 */
//        //복잡도 0(logn)
//        int[] arr = {1,3,6,8,9,11,15};
//        Arrays.sort(arr);
//        // 사전에 오름차순 정렬이 되어 있어야 이진검색 가능
//        System.out.println(Arrays.binarySearch(arr,15));
//
//        // 배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2); //f
//        // Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2)); //t

//        /* 2차원배열 선언과 할당 */
//        int[][] arr = new int[2][3];
//        arr[0][1] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        //리터럴 방식으로 할당
//        int[][] arr2 = {{1,2,3}, {4,5,6}};
//        // {{1,2,3}, {4,5,6}}
//
//        // 2차원 배열의 출력
//        //System.out.println(Arrays.toString(arr2)); // f -> 주소지가 나옴
//        System.out.println(Arrays.deepToString(arr2));

//        // 2차원 가변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//        // 가변배열 리터럴 방식
//        int[][] arr2 = {{10,20}, {10,20,30}};

        // [3][4]사이즈의 배열얼 선언한 뒤 1~12까지 숫자값 각 배열에 할 당 후 출력
        // {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
//        int[][] arr3 = new int[3][4];
//        int count = 1;
//        for(int i = 0 ; i < arr3.length ; i++){
//            for(int j = 0 ; j < arr3[i].length ; j++){
//                arr3[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr3));

//        int[][] arr1= {{1,2},{2,3}};
//        int[][] arr2 ={{3,4},{5,6}};
//        int[][] answer = new int[arr1.length][arr1[0].length];
//
//        for(int i = 0 ; i < answer.length ; i++){
//            for(int j = 0 ; j < answer[i].length ; j++){
//                arr1[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }

        // 가변배열 실습 : 행의길이(전체배열의길이)5 => {{10}, {20,20}, {30,30,30}, {40,40,40,40}, {x,x,x,x,x,}}
        int[][] arr = new int[5][];
        int count = 10;
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = new int[i+1];
            for(int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = (i+1) * 10;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

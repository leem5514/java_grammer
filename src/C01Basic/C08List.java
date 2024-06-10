package C01Basic;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
//        /* List 선언 방식 */
//        ArrayList<String> list = new ArrayList<String>();
//        ArrayList<String> list2 = new ArrayList<>();
//
//        //가장 일반적인 List 선언 방식
//        // 왼쪽엔 인터페이스 , 오른쪽에는 구현체(클래스)
//        List<String> list3 = new ArrayList<>();
//
//        // 초기값 생성 방법1, 하나씩 add
//        list3.add("java");
//        list3.add("python");
//        list3.add("c++");
//
//        // 초기값 생성 방법2 . 리스트를 주입
//        // Arrays.asList 는 배열을 리스트로 변환하는 메서드
//        String[] myArr = {"java", "python", "c++"};
//        List<String> list4 = new ArrayList<>(Arrays.asList(myArr));
//        List<String> list6 = new ArrayList<>(List.of(myArr));
//
//        int[] intArr = {10,20,30};
//        // List<int[]>이렇게 인트 배열 은 형 변환 없이 들어올 수 있음.
//        List<Integer> list5 = new ArrayList<>();
//        for(int i : intArr) {
//            list5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList);
//        // add(index, 값) : 중간 값 삽입
//        myList.add(0,30);
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//
//        // 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
//
//        // get : 특정 위치와 요소 반환
//        System.out.println(myList.get(0));
//
//        // for 문을 돌려 전체 list 출력
//        // size() : 리스트의 길이(개수) 반환
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
//        // remove : 요소 삭제
//        // 1) index을 통한 삭제 2) value을 통한 삭제
//        System.out.println(myList);
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        // set(index, value) : 인덱스 위치의 자리에 value값 setting(변경)
//        myList.set(myList.size() - 1, 10);
//
//        // indexOf : 특정값이 몇번째 index에 위치하는지 return
//        // 가장 먼저 나오는 값의 index return.
//        System.out.println(myList.indexOf(10));

//        // 전체 삭제 : clear()
//        // isEmpty : 값이 비었는지, 안 비었는지
//        // contains : 특정값이 있는지 없는지 확인
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        System.out.println(list.contains(20)); //f
//
//        // 이중 리스트(리스트 안 리스트)
//        List<List<Integer>> myList = new ArrayList<>();
//        // [ [] , [] ]
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(10);
//        myList.get(0).add(20);
//        myList.get(1).add(1);
//        myList.get(1).add(2);
//        System.out.println(myList);

//        // 리스트 안 배열 : 배열 사이즈 2, 3, 4 개짜리 배열 3개 들어가는 것으로  add
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[2]);
//        myList2.add(new int[3]);
//        myList2.add(new int[]{10,20,30});

//        // 리스트 정렬 : Collections.sort(), 리스트 객체.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//        // 정렬1. Collections.sort()
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        // 정렬2. 리스트객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

//        //(실습) 프로그래머스 - n의 배수 구하기
//        int n = 5;
//        int[] numlist = {1, 9, 3, 10, 13, 5};
//        List<Integer> answerlist = new ArrayList<>();
//
//        for(int i = 0 ; i < numlist.length; i++){
//           if(numlist[i]%n == 0 ){
//               answerlist.add(numlist[i]);
//           }
//        }
//        int[] answer = new int[answerlist.size()];
//        for(int i = 0 ; i < answer.length ; i++){
//            answer[i] = answerlist.get(i);
//        }
//        System.out.println(Arrays.toString(answer));

//        //(실습) 프로그래머스 - 두 수 더하기
//        int[] numbers = {2,1,3,4,1};
//        List<Integer> temp = new ArrayList<>();
//
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if(!temp.contains(numbers[j]+numbers[i])) temp.add(numbers[j] + numbers[i]);
//            }
//        }
//        Collections.sort(temp);
//        int[] answer = new int[temp.size()];
//        for(int i = 0; i < temp.size(); i++) {
//            answer[i] = temp.get(i);
//        }
//        System.out.println(Arrays.toString(answer));

        // 두 개 뽑아서 더하기
        // 배열과  List 간 변환
        // 1.String 배열을 List<String>으로 변환
        String[] stArr = {"java", "python", "C++"};
        // 1-1. Arrays.asList
        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
        // 1-2. for 문을 통해 담기
        // 1-3. streamApi(참고만)
        List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());

        // 2. List<String>을 통한 String배열로 전환
        // 2-1. for문을 통해 담기
        // 2-2. toArray
        String[] stArr2 = stList1.toArray(new String[stList1.size()]);

        // 3. int배열을 List<Integer>로 변환
        // 3-1. for 문을 통해 담기
        // 3-2. streamAPI사용
        int[] intArr = {10,20,30,40};
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());
    }
}

package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);


//        // (실습) 프로그래머스 - 폰켓몬
//        int[] nums = {3,3,3,2,2,2};
//        Set<Integer> mySet = new HashSet<>();
//        for(int n: nums) {
//            mySet.add(n);
//        }
//        int answer = mySet.size()>nums.length/2?nums.length/2:mySet.size();

//        List<String> myList = new ArrayList<>();
//        myList.add("tennis");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("basketball");
//        myList.add("basketball");
//
//        // list 을 인자값으로 받아서 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet);
//
//        String[] arr = {"baseball", "baseball", "basketball", "basketball"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        mySet2.remove("baseball");
//        System.out.println(mySet2);

//        // (실습) 프로그래머스 - 전화번호 목록
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        Arrays.sort(phone_book);
//        boolean answer = true;
//        for(int i = 0 ; i < phone_book.length; i++) {
//            StringTokenizer st = new StringTokenizer(phone_book[i], ",");
//        }
//        for(int i = 1 ; i < phone_book.length; i++) {
//            if(!phone_book[i].contains(phone_book[0])) {
//                answer = true;
//                break;
//            } else {
//                answer = false;
//            }
//        }
//
//        System.out.println(answer);

//        // 집합관련 함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> set1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("java", "html", "css"));
//
//        //set1.retainAll(set2); // 교집합
//        //set1.addAll(set2); // 합집합
//        //set1.remove(set2); // 차집합
//
//        // (참고)관련문제 : 뉴스 클러시터링

//        System.out.println(set1);

//        //LinkedHashSet, TreeSet
//        Set<String> mySet = new TreeSet<>();
//        mySet.add("hello5");
//        mySet.add("hello5");
//        mySet.add("hello4");
//        mySet.add("hello1");
//        System.out.println(mySet);

//        // (실습) 두개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1};
//        Set<Integer> temp = new TreeSet<>();
//
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                  temp.add(numbers[j] + numbers[i]);
//            }
//        }
//        int[] answer = new int[temp.size()];
//        for(n : temp.iterator()) {
//
//        }
//        System.out.println(Arrays.toString(answer));

    }

}

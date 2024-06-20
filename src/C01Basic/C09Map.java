package C01Basic;

import java.util.*;

import static javax.swing.UIManager.get;

public class C09Map {

    public static void main(String[] args) {

//        /* Map */
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer","축구");
//        myMap.put("baseball", "야구");
////        System.out.println(myMap); // {soccer=축구, basketball=농구, baseball=야구}
////        System.out.println(myMap.get("soccer")); // 축구
//
//        // key는 중복이 되면 안되지만, value는 중복 가능
//        myMap.put("baseball", "크리캣"); // update
//        // baseball을 map에서 검색하는 복잡도 O(1)
//        System.out.println(myMap.get("baseball")); // 크리캣
//        myMap.remove("baseball");
//        System.out.println(myMap); // {soccer=축구, basketball=농구}
//
//        // putifAbset -> basketball이 없으면   // 주어진 키가 맵에 없을 때 값 추가
//        myMap.putIfAbsent("basketball", "배구");
//        System.out.println(myMap); // {soccer=축구, basketball=농구} 그대로 농구임
//        // getOrDefault : key가 없으면 defualt값 return
//        System.out.println(myMap.get("baseball")); // null
//        System.out.println(myMap.getOrDefault("baseball", "비어있음")); // null일 때 비어있음 출력

//        // 실습
//        String[] arr= {"농구", "농구", "배구", "야구", "배구"};
//        Map<String, Integer> myMap2 = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (myMap2.containsKey(arr[i])) { // 이미 있는지 여부 확인
//                myMap2.put(arr[i], myMap2.get(arr[i]) + 1);
//            } else {
//                myMap2.put(arr[i], 1);
//            }
//        }
//        System.out.println(myMap2);
//        // enhanced for문 (위랑 같음)
//        for (String s : arr) {
//            if (myMap2.containsKey(s)) { // 이미 있는지 여부 확인
//                myMap2.put(s, myMap2.get(s) + 1);
//            } else {
//                myMap2.put(s, 1);
//            }
//        }
//        System.out.println(myMap2);
//
//        // 위 문제를 defaultValue 활용 -> 간결 그잡채
//        for (String s : arr) {
//            myMap2.put(s, myMap2.getOrDefault(s, 0) + 1);
//        }
//
//        // keySet() : 키 목록을 반환
//        // values() : value 목록을 반환
//        // enhanced for문을 통해 key값 하나씩 출력
//        /*for (String a : myMap2.keySet()) {
//            System.out.println(a); // key 출력됨
//            System.out.println(myMap2.get(a)); //해당 key에 대한 value 출력됨
//        }
//        for (int s : myMap2.values()) {
//            System.out.println(s); // value값만 출력됨
//        }*/
//
//        System.out.println("====================================");
//        // iterator를 통해 key값을 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
//        System.out.println(myMap); // {soccer=축구, basketball=농구}
//        //System.out.println(myIter.next()); //soccer
//        System.out.println(myIter); // 주소 출력됨 -> toString 내장x
//
//        // hasNext() : iterator안에 값이 있는지 없는지 boolean return
//        while (myIter.hasNext()) { // 다음 값이 있을 때까지
//            System.out.println(myIter. next()); // 하나씩 출력하면서 사라짐 (soccer, basketball 출력됨)
//        }

//        // (실습) 프로그래머스 - 완주하지 못한 선수
//        String answer = "";
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};
//        Map<String, Integer> myMap = new HashMap<>();
//        for (String s : participant) {
//            myMap.put(s, myMap.getOrDefault(s, 0)+1);
//        }
//        for (String s : completion) {
//            myMap.put(s, myMap.getOrDefault(s, 0)-1);
//        }
//        for(String s : myMap.keySet()) {
//            if(myMap.get(s)==1) {
//                answer = s;
//            }
//        }



//        // (실습) 프로그래머스 - 의상
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Map<String, String> temp = new HashMap<>();
//        for(int i = 0 ; i < clothes.length; i++) {
//            for(int j = 0 ; j < clothes[i].length; j++) {
//                temp.put(clothes[i][j], myMap.get(clothes[i][j]));
//            }
//        }
//        int answer = 0;
//        return answer;

//        // LinkedHashMap : 데이터 삽입순서 유지
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 1);
//        linkedMap.put("hello3", 1);
//        linkedMap.put("hello2", 1);
//        linkedMap.put("hello1", 1);
//        System.out.println(linkedMap);  // {hello5=1, hello4=1, hello3=1, hello2=1, hello1=1} 순서 유지

//        // TreeMap : key 을 통해서 데이터를 정렬(최적화)    ->  key 값 오름차순
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 1);
//        treeMap.put("hello3", 1);
//        treeMap.put("hello2", 1);
//        treeMap.put("hello1", 1);
//        System.out.println(treeMap);

//        // (실습) 프로그래머스 - 문자열 내 마음대로 정렬하기
//        String[] strings = {"abce", "abcd", "cdx"};
//        String[] strings = {"sun", "bed", "car"};
//        int n = 2;
//        int n = 1;
    //        Map<String, String> tree = new TreeMap<>();
//
//        for (String s : strings) {
//            tree.put(s.charAt(n) + s, s);
//        }
//
//        String[] answer = new String[strings.length];
//        int index = 0;
//        for (String s : tree.values()) {
//            answer[index++] = s;
//        }
    }
}
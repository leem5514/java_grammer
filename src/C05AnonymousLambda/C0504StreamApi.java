package C05AnonymousLambda;

import jdk.dynalink.Operation;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamApi {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
//        // 레거시 방식의 데이터 접근 방식 : 메모리 주소로 접근
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }

        // 함수형 프로그래밍 방식 : 데이터와 객체 중심인 아닌, 입력에 따른 출력만 존재
        // java 에서 함수형 프로그래밍을 지원하기 위한 라이브러리 가 streamAPI
        // foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));

//        /* Stream의 생성 */
//        String[] stArr = {"HTML" , "CSS", "JAVA", "PYTHON"};
//        /* Stream<클래스명> : 제네릭타입으로 stream 객체가 생성 */
//        Stream<String> stream1 = Arrays.stream(stArr);
//
//        List<String> stlist = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stlist.stream();
//
//        int[] intArr = {10,20,30,40,50};
//        //Stream<Integer> stream3 = Arrays.stream(intArr); //(오류) int형은 변환 불가!!
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList = new ArrayList<>(); // 초기값이 Integer일 때는 받아올 수 있음.
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        Stream<Integer> stream4 = myList.stream();
//        //IntStream stream5 = myList.stream(); // (오류)int가 아니라 Integer 이기 때문에 IntStream은 사용 불가!

//        /* stream 변환(중개연산) : filter, map, sorted, distinct, limit */
//        String[] stArr = {"HTML" , "CSS", "JAVA", "PYTHON"};
//        // filter : 특정 기준으로 대상을 filtering 하는 것. Stream<String> 반환
//        // Arrays.stream(stArr).filter(a -> a.length() <= 4) 여기까지가 Stream<String>을 반환
//        // 제네릭의 타입소거 문제 발생
//        // 제네릭의 타입소거란 제네릭타입을 런타임시점에는 제거하는 것을 의미
//        // 그래서, 타입이 소거된 Stream객체에서 배열로 변환 시 타입이 뭔지를 명시해줘야함(타입캐스팅)
//        String[] newStArr = Arrays.stream(stArr).filter(a -> a.length() <= 4).toArray(a -> new String[a]); // a 변수에는 stream 요소의 개수
//        // String[]::new -> 메서드 참조 방식(매개변수가 추론 가능할 때 생략하는 형식) , 클래스(String[])::메서드(new -> string 배열의 생성자를 호출하기 때문에 메서드로 봄)
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length() <= 4).toArray(String[]::new);
//
//        int[] intArr = {10,10,30,40,50};
//        int[] newIntArr = Arrays.stream(intArr).filter(a -> a <= 30).toArray();
//        System.out.println(Arrays.toString(newIntArr));
//
//        // distinct : 중복제거
//        int[] newIntArr2 = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr2));
//        int total =Arrays.stream(intArr).sum();
//        System.out.println(total);

//        // map : 기존의 스트림을 조작하여 새로운 스트림 반환
//        int[] newMapArr = Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));


//        // (실습) 홀수 찾기
//        int[] arr1 = {1,2,3,4,5,6};
//        // 홀수만 담은 배열 생성 filter
//        int[] intArr = Arrays.stream(arr1).filter(a->a % 2 != 0).toArray();
//        // 배열의 값을 제곱한 새로운 배열 생성 : filter, map
//        int[] intArr2 = Arrays.stream(arr1).filter(a->a % 2 != 0).map(a->a*a).toArray();
//        //홀수만 담은 배열의 값을 제곱한 새로운 배열 오름차순 정렬 생성 : filter, map, sorted
//        int[] intArr3 = Arrays.stream(arr1).filter(a->a % 2 != 0).map(a->a*a).sorted().toArray();
//
//        // mapToInt : intream형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "JAVASCRIPT", "JAVA"};
//
//        // 각 문자열의 길이를 담은 새로운 int 배열 생성
//        int[] intArr4 = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        System.out.println(Arrays.toString(intArr4));
//        int[] intArr5 = Arrays.stream(stArr).mapToInt(a->a.length()).limit(3).toArray();
//        System.out.println(Arrays.toString(intArr5));

//        // 스트림의 소모 : 합계, reduce : 누적연산, foreach(출력)
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(System.out::println); // .foreach(a->System.out.println(a))와 동일
//        int intArrSum = Arrays.stream(intArr).sum();
//
//        // optional 객체 : 값이 있을수도 있고, 없을 수도 있음을 명시한 객체
//        int intArrMax = Arrays.stream(intArr).max().getAsInt(); // 값을 꺼내는 코드임 없을 시에 에러 발생
//        int intArrMin = Arrays.stream(intArr).min().getAsInt();
//        int intArrCount = (int)Arrays.stream(intArr).count();
//
//        // reduce(초기값, 연산식);
//        int allMultiply = Arrays.stream(intArr).reduce(1, (a,b) -> a * b); // reduce는 2개의 값이 들어온다는 전제조건 있음.
//        int allAdd = Arrays.stream(intArr).reduce(0, (a,b) -> a + b); // reduce는 2개의 값이 들어온다는 전제조건 있음.
//        System.out.println(allMultiply);
//        System.out.println(allAdd);
//        String[] stArr = {"hello","java","world"};
//        String stAllAdd = Arrays.stream(stArr).reduce("", (a,b) -> a + b);
//        System.out.println(stAllAdd);

//        /* findFirst */
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim", 20));
//        students.add(new Student("choi", 32));
//        students.add(new Student("lee", 35));
//        students.add(new Student("park", 22));
//
//        // 나이가 30이 넘는 학생중에 첫번 째 index 값을 가지는 학생 객체 생성
//        Student studentArr = students.stream().filter(a -> a.getAge()>= 30).findFirst().get();
//        System.out.println(studentArr);

//        // (실습) student 객체 실습
//        // 1) 모든 객체의 평균 나이 int 결과를 담기,
//        int AverageArr = (int)students.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
//        // 2) 가장 나이 어린 사람 찾기
////        int studentArr3 = students.stream().mapToInt(a -> a.getAge()).min().getAsInt();
//        Student studentArr3 = students.stream().sorted((a,b) -> a.getAge() - b.getAge()).findFirst().get();
//        System.out.println(studentArr3);
//        // 3) 30대의 이름을 String배열에 객체에 담기
//        String[] studentArr4 = students.stream().filter(a -> a.getAge()>= 30).map(Student::getName).toArray(String[]::new);
//        System.out.println(Arrays.toString(studentArr4));

        /* optional 객체 : 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현 */
        // ofNullable : null이 있을 수도 있는 경우에 Optional 객체를 생성하는 메서드
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null;
//        if (opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }

        // Optional 객체 생성 3가지 방법
        Optional<String> opt1 = Optional.empty();
        Optional<String> opt2 = Optional.of("hello"); // null 삽입 불가
        Optional<String> opt3 = Optional.ofNullable(null); // null 삽입 가능

        //Optional 객체 처리 방법 4가지
        // 방법 1) isPresent() 확인 후 get()
        if(opt3.isPresent()) {System.out.println(opt3.get().length());}
        // 방법 2) orElse() : 값이 있으면 있는 값 리턴, 없으면 지정값 리턴
        //System.out.println(opt3.get().length()); // false
        System.out.println(opt3.orElse("").length()); // optioanl 없을 수도 있는 가정이므로 get 불가.!
        // 방법 3) orElseGet() : 값이 있으면 있는 값 리턴, 없을 시에 람다 함수 실행
        System.out.println(opt3.orElseGet(()->new String("")).length());
        // 방법 4) orElseThrow() : 가장 중요. 값이 있는 경우 값 리턴, 없을 시에 지정된 예외 강제 발생
        // 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우 존재.
        System.out.println(opt3.orElseThrow(()->new NoSuchElementException("값이 없습니다.")).length());


        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 32));
        students.add(new Student("kim2", 35));
        students.add(new Student("kim3", 22));

        // 방법 1>
        OptionalDouble answer = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average();
        if(answer.isPresent()) {
            System.out.println(answer.getAsDouble());
        } else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);

        // 방법 2>
        //double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));


    }
}

package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));
        Integer[] intArr = {10, 20, 30};
        intChange(intArr,0,1);
        System.out.println(Arrays.toString(intArr));
        genericChange(stArr,1 ,2);
        System.out.println(Arrays.toString(stArr));

        Person p1 = new Person();
        p1.setValue("LEEMYEONGGYU");

        GenericPerson p2 = new GenericPerson();
        p2.setValue("lee");
        System.out.println(p2.getValue());

        // 제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("java");

        // 컴파일 후 제네릭 소거 - > <> 을 없애고 복잡도를 줄임
//        List myList2 = new ArrayList<>();
//        myList2.add("hello");
//        myList2.add("java");
    }
    /* 제네릭 생성방식 */
    // 1) 메서드 : 반환타입왼쪽 <T>
    // 2) 클래스 : 클래스명 오른쪽 <T>

    // 제네릭 머서드 생성 : 반환타입 왼쪽에 <T> 선언
    // 유의점 : 제네릭은 객체 타입이 들어와야함
    static <T>void genericChange(T[] stArr, int i, int j) {
        T temp = stArr[i];
        stArr[i] = stArr[j];
        stArr[j] = temp;
    }
    static void stChange(String[] stArr, int i, int j) {
        String temp = stArr[i];
        stArr[i] = stArr[j];
        stArr[j] = temp;
    }
    static void intChange(Integer[] intArr, int i, int j) {
        Integer temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }
}
// 제네릭 클래스 생성 : 클래스명 오른쪽에 <T> 선언
class GenericPerson<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


class Person{
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
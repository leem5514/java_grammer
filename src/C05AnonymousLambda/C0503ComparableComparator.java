package C05AnonymousLambda;

import java.util.*;


public class C0503ComparableComparator {
    public static void main(String[] args) {
        // 자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
        /* Comparable 인터페이스에는 comparteTo메서드 선언 */
        /* Comparator 인터페이스에는 compare메서드 선언 */

        // String 클래스에 compareTo 내장(Comparable 구현)
        // String 클래스 외 java 많은 내장 클래스에서 comparable 구현
//        String a = "hello";
//        String b = "horld";
//        // 두 문자열의 각 자리 순차적으로 비교
//        // 문자열의 비교는 유니코드값의 차이를 반환
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2)); // Wrapper 으로 반환 후 비교 진행해야함(원시형태는 못씀.)

//        List<String> myList = new ArrayList<String>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList); // Comparable의 compareTo메서드를 구현하여 정렬
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder()); // 오름
//        System.out.println(myList);
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 24));
        students.add(new Student("lee", 32));
        students.add(new Student("oh", 11));
        students.add(new Student("park", 15));
        students.add(new Student("han", 54));

        // 방법1 > student 객체에서 Comparable을 구현 => compareTO메서드를 오버라이딩
//        Collections.sort(students);
//        for (Student s : students) {
//            System.out.println(s.getName());
//        }
        // 방법2 > comparator을 구현한 익명객체를 sort에 주입
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge() - o2.getAge(); // 오름차순
                return o1.getName().compareTo(o2.getName());
            }
        };

        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(students);
//        for (Student s : students) {
//            System.out.println("이름은 "+ s.getName()+ "나이는"+s.getAge());
//        }


        // (실습)
        // 아래 문자열을 글자길이 순서로 내림차순 정렬하여라
//        String[] stArr = {"hello", "java","C++", "world2"};
//        Arrays.sort(stArr, Comparator.reverseOrder());
//        Arrays.sort(stArr, (a,b)->b.length()-a.length());
//        System.out.println(Arrays.toString(stArr));

        // (실습)
        // [4,5], [1,2] ,[5,0], [3,1]
        // 위 배열이 들어간 아래 리스트를 배열의 0번째 가 아닌 1번째를 기준으로 내림차순 정렬
        List<int[]>myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});

        myList.sort((a,b) -> b[1] - a[1]);
        for (int[] s : myList) {
            System.out.println(Arrays.toString(s));
        }
    }
}

//class Student implements Comparable<Student> {

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 모든 클래스의 조상 클래스인 object 클래스의 toString 메서드를 Overriding하여 객체 호출시에 자동으로 toString메서드 호출
    @Override
    public String toString() {
        return "이름 : " + this.name + ", 나이" + this.age;
    }

////    @Override
////    public int compareTo(Student s) {
////        return this.age - s.getAge(); // 오름차순
////        //return s.getAge() - this.age // 내림차순
////    }
//    @Override
//    public int compareTo(Student s) {
//        return this.name.compareTo(s.getName()); // 내림차순
//        //return s.getName().compareTo(this.name); // 오름차순
//    }


}
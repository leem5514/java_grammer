package C03Inheritance;


// 오버로딩 : 같은 메서드 의름의 메서드 여려개를 정의하는 것
// 오버라이딩 : 부모클래스의 메서드를 재정의
//
//public class CO3O3MethodOverriding {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.sound2();
//
//        // 상속관계일 떄 부모클래스타입을 자식클래스 객체의 타입으로 전환가능
//        // animal 클래스의 정의된 메서드만 사용가능하도록 제약 발생
//        Animal dog2 = new Dog();
////        dog2.sound2(); // 컴파일에러 발생
//    }
//}
//class Animal {
//    void sound() {
//        System.out.println("동물은 소리를 냅니다");
//    } // 오버라이딩
//}
//
//class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("멍멍");
//    }
//    void sound2(){
//        System.out.println("왈왈");
//    }
//}
//class Cat extends Animal {
//    @Override
//    void sound() {
//        System.out.println("야옹");
//    }
//}
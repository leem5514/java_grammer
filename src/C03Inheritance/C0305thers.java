package C03Inheritance;
// 추상c와 인터페이스 차이가 무엇일까? -> 추상c는 구현 메서드 + 구현 x 메서드
// 인터페이스 -> 구현 x 메서드

// 상속 불가
//public class C0305thers extends FinalParents {
public class C0305thers{
    public static void main(String[] args) {
        //AbstractDog dog = new AbstractDog();
        // 추상 클래스와 인터페이스는 구현없이 객체생성 불가능
        //AbstractAnimal animal = new AbstractAnimal();
        //List<Integer> animal = new List<Integer>();
    }
}
// final 클래스에 붙이면 상속불가한 클래스 생성
final class FinalParents {

}

abstract class AbstractAnimal {
    void makeSound1(){
        System.out.println("동물 소리를 냅니다.1");
    }
    // 메서드 앞 final이 붙으면 오버라이딩 불가
    final void makeSound2(){
        System.out.println("동물 소리를 냅니다.2");
    }
    //abstract 키워드는 자식클래스로 하여금 오버라이딩 강제
    // abstract 메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드가 붙어야함
    // 리턴 타입과 매개변수만 정의
    abstract void makeSound3 ();

}
//class AbstractDog extends AbstractAnimal {
////    @Override
////    void makeSound2(){
////        System.out.prinltn("멍멍2)
////    }
//}

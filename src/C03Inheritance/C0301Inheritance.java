package C03Inheritance;

// extends 키워드를 통해서 상속관계 표현
public class C0301Inheritance extends Parents{
    int c = 30;
    public static void main(String[] args) {
        C0301Inheritance obj = new C0301Inheritance();
        // 자식 클래스라고 하더라고 private 변수는 상속 및 접근 불가능
        System.out.println(obj.c);
        System.out.println(obj.a);
        //메서드 상속
        obj.parentMethod();
    }
    // 부모 메서드 재정의 : overriding
    // 성능의 최적화를 위햇 붙여좋는게 좋음 + 명시적 오버라이드 확인
    @Override
    void parentMethod() {
        System.out.println("부모클래스가 아니라 자식 클래스입니다.");
    }

    void childMethod() {
        System.out.println("자식클래스입니다.");
    }
}

class Parents {
    int a = 10;
    private int b = 20;
    void parentMethod(){
        System.out.println("부모 클래스입니다.");
    } // static이 붙어있지 않기 때문에 객체 메서드
}
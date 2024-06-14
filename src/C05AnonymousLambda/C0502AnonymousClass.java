package C05AnonymousLambda;

public class C0502AnonymousClass {
    public static void main(String[] args) {
        // AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고, 익명의 클래스가 만들어짐과 동시에 익명객체 생성
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound2() {

            }
        };
        // 익명객체에 구현메서드가 한개 밖에 없을 때 람다표현식(화살표함수)로 표현가능
        // ()부분에 매개변수를 지정하여 구현체에서 활용
        // 변수의 개수가 많을 때 해당 변수의 개수와 순서를 맞춰서 지정
//        Animal a2 = new Animal() {
//            @Override
//            public void makeSound() {
//
//            }
//        };

//        Animal a2 = () -> System.out.println("동물소리를 냅니다." + a);


        //Animal 익명객체를 만들어 input_input1 +input_input2 +input_input3 을 더해서 return 하는 메서드 정의
        //위에서 return 문자열 출력.
        //실행문이 한줄 일 떄는 {}와 리턴 생략 가능
        // 2줄 이상일 때는 {} 을 사용해서 return 처리
        Animal2 a3 = (a,b,c) -> a+b+c;
        System.out.println(a3.makeSound("hello", "world", 3));
//            @Override
//            public String makeSound(String a, String b, int c) {
//                return a + b + c;
//            }
//        };

        //실행문이 한줄 일 떄는 {}와 리턴 생략 가능
        // 2줄 이상일 때는 {} 을 사용해서 return 처리
        Animal2 a4 = (a,b,c) -> {
            if(c>10) {
                return a+b;
            } else {
                return a;
            }
        };
        System.out.println(a4.makeSound("HELLO", "JAVA", 5));
    }
}

interface Animal{
    void makeSound();
}
interface Animal2{
    String makeSound(String a, String b, int c);
}

abstract class  AbstractAnimal{
    void makeSound1(){

    }
    abstract void makeSound2();
}
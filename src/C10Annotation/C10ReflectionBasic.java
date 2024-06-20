package C10Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// jpa을 통해서 db조회 -> private 변수를 통해서 직접 접근해서 값 할당
public class C10ReflectionBasic {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 객체생성방식 1 ) 기존의 방식과 메서드 호출
        Calculator calculator = new Calculator("SAMSUNG");
        calculator.sayHello();

        // 객체생성방법 2 ) 런타임 환경에서 리플렉션을 기술을 통해서 객체 생성 및 메서드 호출
        // '<?>' 은 제네릭 표현으로 어떤 클래스타입도 가능하다는 표현
        // getClass 메서드는 런타임 시점에 calculator 라는 객체의 타입을 가지고오는 메서드
        Class<?>myClass = calculator.getClass();
        // 리플렉션 기술을 통해서 필드 접근 및 수정
        // * 어노테이션 <- 런타임환경에서 사용(리플렉션)

        // 객체 생성 2-1 )
        Calculator cal1 = (Calculator) myClass.getConstructor(String.class).newInstance("SAMSUNG");
        // 메서드 생성
        Method cal1Method = myClass.getMethod("sayHello");
        cal1Method.invoke(cal1);

        // 객체생성 2-2 )
        Calculator cal2 = Calculator.class.getConstructor(String.class).newInstance("Casio"); // 자바가 런타임상황에서의 실행 상황을 보여줌
        // 메서드 생성
        Method cal2Method = Calculator.class.getMethod("sayHello");
        cal2Method.invoke(cal2);

        // 리플렉션 기술을 통해 필드 접근 및 수정
        Field nameField = Calculator.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(cal1 , "Casio");
        cal1Method.invoke(cal1);


    }
}
class Calculator {
    private String name;

    Calculator() {
    }
    public Calculator(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("My name is " + this.name);
    }
}
// 루트(최상단) 패키지는 src
package C03Inheritance.ProtectedTest;
// * 을 통해서 패키지 내 모든 클래스 import 가능
// * 을 통해서 패키지 내 패키지 까지 포함하여 모든 내용 import 는 불가능
// 즉, import java.* -> 불가능
import C03Inheritance.C0304ProtectedClass;


public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
        //default 접근 불가
        //System.out.println(c1.st2);

        // protected 접근 불가
        //System.out.println(c1.st3);

        ProtectedMain p1 = new ProtectedMain();
        // defualt 불가능
        //System.out.println(p1.st2);

        // 상속한  객체에서 protected 접근 가능
        System.out.println(p1.st3);
    }
}

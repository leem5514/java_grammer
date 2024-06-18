package C06EtcClass;

public class C0605EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("hong1");
        s1.setClassGrade(ClassGrade.c1);

        EnumStudent s2 = new EnumStudent();
        s2.setName("hong2");
        // 여전히 타입이 String 타입 이므로 임의로 클래스 변수 사용하지 않을 수 있음.
        s2.setClassGrade(ClassGrade.c2);
        // role의 경우 Enum으로 설정 시 위와 같은 실수를 방지할 수 있음.
        //s2.setRole("GENERAL_USER"); // 타입 불일치로 False
        s2.setRole(Role.GENERAL_USER);

        System.out.println(s2.getRole());
        System.out.println(s2.getRole().getClass());
        // enum값 내부에는 저장된 순서대로 0부터 index 값이 내부적으로 할당
        System.out.println(s2.getRole().ordinal());
    }
}
class ClassGrade {
    static final String c1 = "first_grade";
    static final String c2 = "second_grade";
    static final String c3 = "third_grade";
}
// 정확성이 유지되어야 하기 때문에 열겨형 값들은 enum 필 사용
enum Role{
    // 각 열거형 상수는 콤마로 구분하고, 상수 목록 끝에 세미콜론으로 마무리
    // static final 생랼이 되어있는 형식
    GENERAL_USER, ADMIN_USER;

}

class EnumStudent {
    private String name;
    private String classGrade;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

}
package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
        //어떤 숫자값이 소수인지 아닌지를 판별하는 메서드 생성
        // 리턴타입 boolean, 매개변수 int 숫자

    }
    public static boolean isPrime(int num) {
        boolean checked = true;
        if (num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                // checked = false;
                // break;
                // 메서드는 return 만나면 바로 메서드 종료
                // void 리턴 타입에서도 메서드 강제종료를 위해서 return 사용
                return false;
            }
        }
        return checked;
    }
}

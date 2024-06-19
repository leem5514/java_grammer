package C08Thread;

// Thread 클래스에는 run 메서드가 있는데, 빈 메서드
// 실행 시 작업하고자 하는 내용을 run() 메서드를 통해서 overriding을 통해서 구현
    // 상속 관계이다보니 '다중 상속' 불가 : Runnable과 차이점
public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1 실행 시작");
    }
}

package C08Thread;

// 스레드 생성방법
//  1) 스레드 상속 방식
//  2) 런어블 구현 방식
//
// 스레드 동시성 이슈 해결방법
//  1) syncronized
//  2) join()
public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        /* 스레드 생성 방법 2가지 : */
        //  1) 스레드 상속 방식
//        Thread1 t1 = new Thread1();
//        t1.start();
//        Thread t2 = new Thread1();
//        t2.start();
        //  2) Runnable 구현한 객체를 Thread 클래스에 주입 방식
//        Thread t3 = new Thread(new Thread2());
//        t3.start();
//        new Thread(new Thread2()).start();
//        new Thread(() -> System.out.println("익명 Runnable객체 주입 후 실행 Thread")).start();

        // Thread 동시성 이슈 해결방법 2가지
//        for(int i = 0 ; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println("최종적으로 남은 수량" + Library.bookCount);
//        for (int i = 0; i < 50000; i++) {
//            new Thread(() -> {
//                try {
//                    Library.borrow();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }).start();
//        }
//        System.out.println("최종적으로 남은 수량" + Library.bookCount);


        // 동시성 이슈 해결 방법 첫번 쨰 , join()
        for (int i = 0; i < 50000; i++) {
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start();
//            t1.join();
        }
        System.out.println("최종적으로 남은 수량" + Library.bookCount);
    }

    // 문맥 교환 비용 발생(context Switching)
    // => 단순한 코드인 경우엔, 싱글 스레드가 더 효율적 일 수 있음.
    // cpu가 이동하면서 그에 따른 시간 증가
}

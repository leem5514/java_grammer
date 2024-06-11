package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<Integer>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        System.out.println(q.peek()); //10
//        System.out.println(q); //10 20 30
//        System.out.println(q.poll()); // 10
//        System.out.println(q); // 20 30


//        //LinkedList와 ArrayList 비교
//        // LinkeSystem.out.println(q.peek());dList 의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i <100000; i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist의 중간 삽입 : " + (endTime - startTime)); // 실행시간 확인
//
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0; i <100000; i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Arraylist의 중간 삽입 : " + (endTime2 - startTime2)); // 실행시간 확인
//
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0; i <100000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedlist의 중간 조회 : " + (endTime3 - startTime3)); // 실행시간 확인
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i = 0; i <100000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("Arraylist의 중간 조회 : " + (endTime4 - startTime4)); // 실행시간 확인

        /*  queue */
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while(!myQue.isEmpty()){ // myQue가 비어있지 않을 때 로직 실행
//            System.out.println(myQue.poll());
//        }

        // ArrayBlockingQueue : 길이제한 큐
//        Queue<String> queue = new ArrayBlockingQueue<String>(3);
//        // add 사용 시 길이제한 초과시 예외 발생 -> offer 으로 대체 가능 offer 은 초과시 null 반환
//        queue.add("10");
//        queue.add("20");
//        queue.add("30");
//        queue.add("40");
//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40");
//        System.out.println(queue);

//        // 우선순위 큐 : 데이터를 꺼낼 때 정렬된 데이터 pop
//        Queue<Integer> pq = new PriorityQueue<Integer>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        Queue<Integer> Squeue = new PriorityQueue<Integer>();
        for (int i = 0; i < scoville.length; i++) {
            Squeue.add(scoville[i]);
        }
        int count = 0;
        while (Squeue.size() > 1 && Squeue.peek() < K) {
            int a = Squeue.poll();
            int b = Squeue.poll();
            Squeue.add(a + 2 * b);
            count++;
        }
        if (Squeue.peek() >= K) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }


    }
}

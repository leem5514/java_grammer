package C01Basic;

import java.util.*;
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
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0; i <100000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedlist의 중간 조회 : " + (endTime3 - startTime3)); // 실행시간 확인
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

//        // (실습) 프로그래머스 - 더 맵게
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int K = 7;
//        Queue<Integer> Squeue = new PriorityQueue<Integer>();
//        for (int i = 0; i < scoville.length; i++) {
//            Squeue.add(scoville[i]);
//        }
//        int count = 0;
//        while (Squeue.size() > 1 && Squeue.peek() < K) {
//            int a = Squeue.poll();
//            int b = Squeue.poll();
//            Squeue.add(a + 2 * b);
//            count++;
//        }
//        if (Squeue.peek() >= K) {
//            System.out.println(count);
//        } else {
//            System.out.println(-1);
//        }

        /* stack */
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//        // pop : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(st1.pop()); // 30
//        System.out.println(st1.peek()); // 20
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());
//
//        // String 객체 5개 정도 stack에 추가 후 while을 통해 출력
//        Stack<String> st2 = new Stack<>();
//        st2.push("Language");
//        st2.push("is Old");
//        st2.push("Java");
//        st2.push("World");
//        st2.push("Hello");
//        while(!st2.isEmpty()) {
//            System.out.print(st2.pop()+ " ");
//        }

        // (실습) 프로그래머스 - 같은 숫자는 싫어
//        int[] arr = {1,1,3,3,0,1,1};
//        int[] answer = new int[arr.length];
//        Stack<Integer> st2 = new Stack<>();
//        st2.push(arr[0]);
//        for(int i = 1; i < arr.length; i++) {
//            st2.push(arr[i]);
//            if(arr[i] == arr[i-1]) {
//                st2.pop();
//            }
//        }
//        int count = 0;
//        System.out.println(st2);

        // (실습) 올바른 괄호
//        boolean answer = true;
//        Stack<String> stack = new Stack<>();
//        for(int i = 0 ; i <s.length(); i++) {
//            char c = s.charAt(i);
//            if( c == '(') {
//                stack.push(s);
//            } else if(stack.isEmpty()) {
//                answer = false;
//                break;
//            } else {
//                stack.pop();
//            }
//        }
//        if(!stack.isEmpty()) {
//            answer = false;
//        }
//
//        return answer;

        /* deque */
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(10);
        dq.addLast(20);
        System.out.println(dq);
        dq.addFirst(30);
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.pollFirst()); // poll
        System.out.println(dq.pollLast()); // pop

    }
}

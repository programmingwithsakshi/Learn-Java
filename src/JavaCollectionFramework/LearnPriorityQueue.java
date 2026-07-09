import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(23);
        pq.offer(30);
        pq.offer(13);
        pq.offer(60);
        pq.offer(23);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
    }
}

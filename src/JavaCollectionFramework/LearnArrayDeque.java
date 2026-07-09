import java.util.ArrayDeque;
import java.util.*;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(1);
        adq.add(3);
//        System.out.println(adq);
        adq.addFirst(2);
        adq.offerFirst(6);
        adq.addLast(4);
        adq.offerLast(5);
        System.out.println(adq);
        adq.poll();
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekLast());
        System.out.println(adq.getFirst());
        adq.pollFirst();
        adq.pollLast();
        Iterator<Integer> i = adq.iterator();
        while(i.hasNext()){
            System.out.println("element"+i.next());
        }
        System.out.println(adq);
    }
}

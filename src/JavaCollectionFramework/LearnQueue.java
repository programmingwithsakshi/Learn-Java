package JavaCollectionFramework;
import java.util. *;
public class LearnQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
//        q.poll();
        q.remove();
        System.out.println(q);



    }
}

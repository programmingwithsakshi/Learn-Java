import java.util.*;
public class LearnMap {
    public static void main(String[] args) {
//        Map<Integer,String> m = new HashMap<>();
        Map<Integer,String> m = new LinkedHashMap<>();
        m.put(1,"first");
        m.put(3,"second");
        m.put(4,"third");
        m.put(2,"error");
        System.out.println(m);
        m.remove(2);
        System.out.println(m);
        if(!m.containsKey(2)){
            m.put(2,"newTwo");
        }
        System.out.println(m);



    }
}

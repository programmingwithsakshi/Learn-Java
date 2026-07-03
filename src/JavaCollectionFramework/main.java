package JavaCollectionFramework;
import java.util.*;

public class main {
    public static void main(String[] args) {
ArrayList<String> stu = new ArrayList<String>();
ArrayList<String> list = new ArrayList<>();

//add
stu.add("a");
stu.add("b");
stu.add("c");
list.addAll(stu);
//update
        stu.set(2,"d");
        stu.remove("b");

//list.removeAll(stu);
System.out.println(stu);
System.out.println(list);
        list.removeAll(stu);
        System.out.println(list);
        //iterator
        Iterator<String> iterator = list.iterator();
                while(iterator.hasNext()) {
                    System.out.println("Element: " + iterator.next());
               }

}
}

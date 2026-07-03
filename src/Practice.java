import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 ="";
        int len = str.length();
        for(int i = len-1;i>=0;i--){
            str2 = str2 + str.charAt(i);
//            System.out.println("1");
        }
        System.out.println(str2);
        if(str2.equals(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

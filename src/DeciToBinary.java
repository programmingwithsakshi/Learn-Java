import java.util.Scanner;
import java.lang.Math;
public class DeciToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        int i=0;
        while(num!=0){
            int bit = num & 1;
            ans = (int) (bit*(Math.pow(10,i))+ans);
            num = num>>1;
            i++;
        }
        System.out.println(ans);
    }
}

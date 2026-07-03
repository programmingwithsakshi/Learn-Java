import java.util.Scanner;

public class BasicMath1 {
    static int sumDigit(int num ) {
            int sum = 0;
        while ( num != 0) {
            int rem;
            rem = num % 10;
            sum = sum + rem;
            num= num/10;
        }
            return sum;
    }
    public static void main(String[] args) {
        //print digit of number
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number ");
//        int num = sc.nextInt();
//        while(num!=0){
//            int rem;
//            rem= num%10;
//            System.out.println(rem);
//            num= num/10;
//        }
        //count digit of number
//        int count=0;
//        while(num!=0){
//            int rem;
//
//            rem= num%10;
//            count++;
//            num= num/10;
//        }
        int ans = sumDigit(1243);
        System.out.println(ans);

    }
}

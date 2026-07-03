import java.lang.Math;

import static java.lang.Math.pow;

public class PrimeNum {
    static void PrimeNum(int num){
        int flag=0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                flag++;
            }

        }
        if(flag>0){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }
    }
    static void allPrime(int n){
        for(int i=1;i<=n;i++){
            for(int k=2;k<n;k++){
            if(i+1%i==0){
                continue;

            }else
            {System.out.println(i);}
            }

        }
//        if(flag>0){
//            System.out.println("Not Prime");
//        }else {
//            System.out.println("Prime");
//        }
    }

    public static void main(String[] args) {
        PrimeNum(6);
//        allPrime(10);
    }
}

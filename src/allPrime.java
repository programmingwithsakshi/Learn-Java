public class allPrime {
    static boolean PrimeNum(int num) {
        int flag = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                flag++;
            }

        }
        if (flag > 0) {
            return false;
        } else {
            return true;
        }
    }
        static void allPrime(int n){
            for(int num=2;num<=n;num++)
            if(!PrimeNum(num)){
                continue;
            }else System.out.println(num);
        }

    public static void main(String[] args) {
        allPrime(20);
    }
    }


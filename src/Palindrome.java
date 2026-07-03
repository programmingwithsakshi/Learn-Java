public class Palindrome {

        static void pallindrome(int num){
            int ans=0;
            int numcopy = num;
            while(num!=0){
                int rem;
                rem= num%10;
                ans= ans*10+rem;
                num = num/10;
            }
            if(numcopy==ans) {
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }

        public static void main(String[] args) {
            pallindrome(121);
//            System.out.println(ans);
        }
    }



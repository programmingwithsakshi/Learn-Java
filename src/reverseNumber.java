public class reverseNumber {
    static int reverseNum(int num){
        int ans=0;
        while(num!=0){
            int rem;
            rem= num%10;
            ans= ans*10+rem;
            num = num/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = reverseNum(197824);
        System.out.println(ans);
    }
}

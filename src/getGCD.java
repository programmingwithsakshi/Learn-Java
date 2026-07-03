public class getGCD {
    static int getGCD(int a,int b ){

        while(b!=0){
            int temp = b;
        b = a%b;
        a= temp;
    }
        int ans= a;
        return ans;
    }
    static int getLCM(int a,int b){
        int gcd = getGCD(a,b);
        int lcm = (a*b)/gcd;
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println(getGCD(12,18));
        System.out.println(getLCM(12,18));
    }
}

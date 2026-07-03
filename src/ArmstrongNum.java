public class ArmstrongNum {
    static void armstrongNum(int a){
        int sum =0;
        int orignal=a;
        while(a!=0){
            int digit =  a%10;
            int cube = digit*digit*digit;
            sum= sum+cube;
//        System.out.println(sum);
            a= a/10;
        }
        if(sum==orignal){
            System.out.println("armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
    public static void main(String[] args) {
armstrongNum(37);
    }
}

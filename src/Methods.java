public class Methods {
    //1 print greeting
    static void PrintMessage(){
        System.out.println("Hello");
    }
    //Add a and b
    static int Add(int a,int b){
        return a+b;
    }
    // even number check
    static boolean IsEven(int a){
        return (a % 2 == 0);
    }
    //get maximum
    static int getMaxmum(int a ,int b){
        if(a > b ){
            return a;
        }else{
            return b;
        }
    }
// get percentage
    static  float getPercentage(float obt, int total){
        float percentage= (obt/total)*100;
        return percentage ;
    }
    public static void main(String[] args) {
//PrintMessage();
//int ans = Add(21,3);
//        boolean ans = IsEven(121);
        System.out.println(getMaxmum(212,99));

        System.out.println(getPercentage(88,100) + "%");
    }



}

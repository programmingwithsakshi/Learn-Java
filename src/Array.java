import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum= 0;
//        int[] arr = new int[5];
        int arr[] = {12,32,11,113,6};
        int max = arr[0];
        int min = arr[0];

        int n= arr.length;
                for(int i=0 ; i<=n-1;i++){


                    if(arr[i]>max) {
                        max = arr[i];
                    }
                    if(arr[i]<min) {
                        min = arr[i];
                    }                }
//                for(int val:arr){
//                    sum= sum+val;
//                }
        System.out.println("Max is "+ max);
        System.out.println("Min is "+ min                                         );
    }
}

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //Write a program to print all even numbers from 1 to 50 using a for loop.
//        for(int i=2;i<=50;i=i+2){
//            System.out.println(i);
//        }
//*******************************************************************************************


//        Write a program to reverse a number using a while loop.

//        int num = 10243;
//        int rev = 0;
//        while(num!=0){
//            int digit = num%10;
//            rev = rev*10+digit;
//            num = num/10;
//        }
//        System.out.println(rev);
//********************************************************************

//        Menu Until Exit (Do-While Loop)
//        Scanner sc = new Scanner(System.in);
//        int num;
//        do{
//            System.out.println("Enter Number");
//            num = sc.nextInt();
//        }while(num!=0);
//        System.out.println("Exit");
//  ************************************************************************

//        Pattern Printing (Nested Loop)
//*
//**
//***
//****
//        for(int i=0;i<4; i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//**************************************************************
//        Sum of Array Elements (For-Each Loop)
        int[] nums = {1,23,4,5,2,7,3};
        int sum = 0;
                for(int n :nums){
                    sum = sum+ n;
                }
        System.out.println(sum);
    }

}

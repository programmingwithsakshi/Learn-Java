import java.util.Scanner;

//practice Decision Making in Java - Conditional Statements
public class conditional {
    public static void main(String[] args) {
// Write a Java program that takes an integer as input and checks whether it is even or odd.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int num = sc.nextInt();
//        if(num%2==0){
//            System.out.println("Number is Even");
//        }
//        else{
//            System.out.println("Number is Odd");
//        }
//********************************************************************************************
//        Write a program to input three numbers and print the largest among them.
//        System.out.println("Enter number three number");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//
//        if(num1>num2){
//            if(num1>num3){
//                System.out.println(num1 + " is largest");
//            }
//            else {
//                System.out.println(num3+ " is largest");
//            }
//        }
//        else{
//            if(num2>num3){
//                System.out.println(num2 + " is largest");
//            }
//            else {
//                System.out.println(num3+ " is largest");
//            }
//        }
//*******************************************************************************************
        /*Write a program that takes marks (0–100) as input and prints grade:
        90–100 → A
        75–89 → B
        50–74 → C
        Below 50 → Fail*/
        /*System.out.println("Enter Marks ");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("A");

       }
        else if(marks>=75 && marks<=89){
            System.out.println("B");
        }

        else if(marks>=50 && marks<=74){
            System.out.println("C");
        }
        else if (marks<50 && marks>=0) {
            System.out.println("FAIL");

        }
        else{
            System.out.println("Enter Correct Marks");
        }*/
//*******************************************************************************************
//  Write a program that takes two numbers and an operator (+, -, *, /) and performs the calculation using switch.
       /* System.out.println("enter two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("enter operator");
        String op = sc.nextLine();
switch (op){
    case "+":
        System.out.println(num1+num2);
        break;
    case "-":
        System.out.println(num1-num2);
        break;
    case "*":
        System.out.println(num1*num2);
        break;
    case "/":
        System.out.println(num1/num2);
        break;
    default:
        System.out.println("error");
}*/
//***************************************************************************
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap Year");
                }
                else{
                System.out.println("not a leap year");
            }
            }else {
            System.out.println("leap year");}
        }
        else {
            System.out.println("not a leap year");
        }
    }
}

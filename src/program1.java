import java.util.Scanner;

public class program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(num + " " + str);
    }}

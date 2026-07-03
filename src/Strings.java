import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "sakshi is a good girl";

//        int len = str.length();
//        for(int i=0;i<len;i++){
//            System.out.println(str.charAt(i));
//        }

        //count vowel
//        int count =0;
//        int len = str.length();
//        for(int i=0;i<len;i++){
//            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
//                 count++;
//            }
//        }
//        System.out.println(count);
//reverse string and check pallindrome

//        String str2 = "";
//        int len = str.length();
//        for(int i=len-1;i>=0;i--){
//            str2 = str2 + str.charAt(i);
//        }
//        System.out.println(str2);
//    if(str.equals(str2)){
//        System.out.println("Palindrome");
//    }else {
//        System.out.println("not Palindrome");
//    }
//        Count words in a sentence
//        int word =0;
//        for(int i=0;i<(str.length());i++){
//            if((i == 0 && str.charAt(i) != ' ') ||
//            (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')){
//            word++;
//            }
//
//        }
//        System.out.println(word);
//        Remove all spaces from string
        String str2 ="";
        for(int i=0;i<(str.length());i++) {
            if (str.charAt(i) != ' ') {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}

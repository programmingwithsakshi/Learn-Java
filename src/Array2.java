import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //array with unequal number of column (jagged array)

        Scanner sc = new Scanner(System.in);

//        int arr[][] = new int[3][];
//        int n = arr.length;
//        for(int row=0;row<n;row++){
//            System.out.println("enter Number of row for row : " + row);
//            int colno = sc.nextInt();
//            arr[row] = new int[colno];
//            for(int col= 0;col<colno;col++){
//                arr[row][col] = sc.nextInt();
//            }
//        }
//
//        for(int row=0;row<3;row++){
//        int colno = arr[row].length;
//            for(int col= 0;col<colno;col++){
//                System.out.print(arr[row][col] );
//            }
//            System.out.println();
//        }
        //add element
//        int arr[][]= new int[3][3];
//       int arr[][]={{1,2,3}, {1,2,3},{1,2,3}};
//        int sum = 0;
//        int rown = arr.length;
//        for(int row=0;row<rown;row++){
//            int coln = arr[row].length;
//            for(int col=0;col<coln;col++){
//                sum = sum +arr[row][col];
//            }
//        }
//        System.out.println(sum);
        //minimum and maximum
        int arr[][]={{11,21,13}, {31,24,36},{1,211,113}};
        int min = arr[0][0];
        int max = arr[0][0];
        int rown = arr.length;
        for(int row=0;row<rown;row++){
            int coln = arr[row].length;
            for(int col=0;col<coln;col++){
                if(max<arr[row][col]){
                    max= arr[row][col];
                };
                if(min>arr[row][col]){
                    min= arr[row][col];
                };
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}

public class PatternPrint {
    public static void main(String[] args) {
        int n = 4;
        int row, col;
//        for(int row=1;row<=n;row++){
//        for(int col =1;col<=row;col++){
//            System.out.print("* ");
//        }
//            System.out.println();}
//    }
        //RHOMBUS
//        for (int row = n; row >= 1; row--) {
//            for (int col = row; col >= 1; col--) {
//                System.out.print(" ");
//            }
//            for (int i = 1; i <= n; i++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
        //inverted right angle
//        for(int row=n;row>=1;row--){
//        for(int col =row                         ;col>=1;col--){
//            System.out.print("* ");
//        }
//            System.out.println();}

        //pyramid
//        for (int row =1 ; row<=n;row++){
//            for (int col = 1; col <=(n-row); col++) {
//                System.out.print("  ");
//            }
//            for (int i = 1; i <=(2*row)-1 ; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //reverse pyramid
//        int col;
//        for (int row =1 ; row<=n;row++){
//            for (col = 1; col <=(row-1); col++) {
//                System.out.print("  ");
//            }
//            for (int i = 1; i <=(2*n)-row-(row-1) ; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //HOLLOW SQUARE PATTERN
//        int row, col;
//        for (row = 1; row <= n; row++) {
//            for (col = 1; col <= 6; col++) {
//                if (row == 1 || row == n || col == 1 || col == 6) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        //HOLLOW RIGHT TRIANGLE
//        int row, col;
//for (row = 1; row <= n; row++) {
//            if (row == 1 || row == n || row == 2) {
//                for (col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (col = 1; col <= (row - 2); col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

        //HOLLOW PYRAMID

//        for (row = 1; row <= n; row++) {
//            for (col = 1; col <=(n-row); col++) {
//                System.out.print("  ");
//            }
//            if (row == 1 || row == n) {
//                for (col = 1; col <= (2 * row) - 1; col++) {
//                    System.out.print("* ");
//                }
//            }
//             else{
//                    System.out.print("* ");
//                    for (col = 1; col <= (row *2)-3; col++) {
//                        System.out.print("  ");
//                    }
//                    System.out.print("* ");
//
//                }
//                System.out.println();
//            }
//    for(row=1;row<=n;row++){
//            for ( col = 1; col <=(n-row); col++) {
//                System.out.print("  ");
//            }
//            for (int i = 1; i <=(2*row)-1 ; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (row =1 ; row<=n;row++){
//                    if(row==1){
//                        continue;
//                    }
//                    for (col = 1; col <=(row-1); col++) {
//                System.out.print("  ");
//            }
//            for (int i = 1; i <=(2*n)-row-(row-1) ; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//HOLLOW DIAMOND
//        for(row=1;row<=n;row++){
//            for(col=1;col<=(n-row);col++){
//            System.out.print(" ");
//        }
//        if(row==1){
//            for(col=1;col<=(2*row)-1;col++){
//            System.out.print("*");}
//        }
//        else{
//            System.out.print("* ");
//            for(col=1;col<=(row*2)-3;col++) {
//                System.out.print(" ");
//            }
//            System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (row=1;row<=n-1;row++){
//            for (col=1;col<=row;col++){
//                System.out.print(" ");
//            }
//            if(row==(n-1)){
//                System.out.print("* ");
//            }
//            else{
//                System.out.print("* ");
//                for(col=1;col<=2*(n-row)-2;col++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //SOLID PATTER-13

//        for (row=1;row<=n;row++){
//            //p1
//            for(col=1;col<=row;col++){
//                System.out.print("* ");
//            }
////            p2
//            for (col = 1; col <=2*(n-row) ; col++) {
//                System.out.print("  ");
//            }
////            p3
//            for(col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//
//
//        System.out.println();
//        }
//        //p4
//        for (row=1;row<=n;row++) {
////            p-4
//            for(col=1;col<=(n-row)+1;col++){
//                System.out.print("* ");
//            }
//            //p-5
//            for(col=1;col<=(row-1)*2;col++){
//                System.out.print("  ");
//            }
//            //p-6
//            for(col=1;col<=(n-row)+1;col++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
        //number pyramid
//        for(row=1;row<=n;row++) {
//        for (col=1;col<=row;col++){
//            System.out.print(col);
//        }
//            System.out.println();
//        }
        //number pyramid 2
//            int i=0;
//        for(row=1;row<=n;row++) {
//        for (col=1;col<=row;col++){
//            i++;
//            System.out.print(i + " ");
//        }
//            System.out.println();
//        }
//
        //PYRAMID ALPHABET

//        for(row=1;row<=n;row++) {
//        for (col=65;col<=row+64;col++){
//            System.out.print((char)(col));
//
//        }
//            System.out.println();
//        }

        //ALPHABET PYRAMID-2
//        for(row=1;row<=n;row++) {
//        for (col=1;col<=row;col++){
//            System.out.print((char)(70-col));
//
//        }
//            System.out.println();
//        }
//

        //NUMBER    PYRAMID

//        for(row=1;row<=n;row++){
////            p1
//            for(col=1;col<=(n-row);col++){
//                System.out.print(" ");
//            }
////            p2
//            for(col=1;col<=row;col++){
//                System.out.print(col);
//            }
//
////            p3
//            for(col=row-1;col>=1;col--){
//                if(row==1)
//                    continue;
//                System.out.print(col);
//            }
//            System.out.println();
//        }
        //pattern
//        for(row=1;row<=n;row++){
//            for(col=1;col<=(n-row);col++)
//                System.out.print(" ");
//            for (col=1;col<=(2*row)-1;col++){
//                System.out.print(row);
//            }
//            System.out.println();
//        }
        //alphabet
        for(row=1;row<=n;row++){
//            p1
            for(col=1;col<=(n-row);col++){
                System.out.print(" ");
            }
//            p2
            for(col=1; col<=row; col++){
                System.out.print((char)(col + 'A' - 1));
            }

//            p3
            for(col=row-1;col>=1;col--){
                System.out.print((char)(col+'A'-1));
            }
            System.out.println();
        }
    }}





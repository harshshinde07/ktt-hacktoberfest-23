package Patterns;
import java.util.Scanner;

/*
 * Name : Lahu Shahadev Andhale
 * Date : 22-10-2023 
 */
public class HollowRectangle {
    public static void hollowPattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || j == c || i == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number Rows: ");
        int R = sc.nextInt();
        System.out.print("Enter No of Column: ");
        int C = sc.nextInt();
        System.out.println("The pattern is : ");
        hollowPattern(R, C);
    }
}
/*
 * Output : 
 * Enter the number Rows: 5
 * Enter No of Column: 4
 * The pattern is : 
        ****
        *  *
        *  *
        *  *
        ****
 */
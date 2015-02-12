
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAMISA
 */
public class pascalTriangle {
    private static int n;

    public static void main(String arg []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        n = in.nextInt();
        printTriangle(n);
    }
         public static double factorial(int n){
        if( n == 0){
             return 1;
        }
         else{
                    return (n*(factorial(n-1)));
         }
    }
         public static int combination(int upper, int lower){
             return (int)(factorial(upper)/(factorial(lower) * factorial(upper - lower)));
         }

         public static void printCoeff(int n){
            for(int i = 0; i <= n; i++)
            {
                System.out.print(combination(n,i) + "\t");

            }
            System.out.println();
         }

         public static void printTriangle(int n){
            for(int i = 0; i <= n; i ++)
            {
                printCoeff(i);
            }
         }
}
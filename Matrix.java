import java.util.Scanner;

/**
 * Write a description of class Matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrix
{
    public static int matrixSum( int[][] array )
    {
        // return the sum of all of the elements of "array".

        return 0;
    }

    public static int countAppearances( int[][] array, int num )
    {
        // count the number of times the value "num" appears in "array".
        
        return 0;
    }

    public static void printMatrix( int[][] array )
    {
        // print the 2D array
        
    }

    public static void main( String[] args )
    {
        int[][] matrix1 = { 
                {  1,  2,  3,  4 }, 
                {  5,  6,  7,  8 }, 
                {  9, 10, 11, 12 }, 
                { 13, 14, 15, 16 } 
            };
        int sum1 = matrixSum( matrix1 );
        int numApp1 = countAppearances( matrix1, 5 );
        printMatrix( matrix1 );
        System.out.println( "The sum is " + sum1 );
        System.out.println( "The number 5 appears " + numApp1 + " times." );
        // create two more 2d arrays, print them out, output their sum, 
        // and output the number of times a number appears in each one.
        
    }
}

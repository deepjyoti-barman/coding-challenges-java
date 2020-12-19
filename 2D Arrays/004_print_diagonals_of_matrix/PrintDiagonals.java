
// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 17 (Thursday), 2020




import java.util.Arrays;
import java.util.Scanner;

/**
 * It is built to take the size of a square matrix as input. Input the elements. Display them in matrix form and also print its diagonals in the given manner.
 * 1     3
 *    5
 * 7     9
 * 
 * Note: A matrix is said to be a square matrix if, no of rows = no of columns.
 * 
 * @author Deepjyoti Barman
 * @since December 18, 2020
 */
class PrintDiagonals
{
    static Scanner sc = new Scanner(System.in);

    // Creates an array, initializes its members and returns the array reference
    public static int[][] initArray(int row, int col)
    {
        if (row < 1 || col < 1)
            throw new ArithmeticException("the row and col size of 2D array must be equal or greater than 1");

        // Initializes the array
        int[][] arr = new int[row][col];

        // Stores the elements into the 2D array taking inputs from user
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }   
        }

        return arr;
    }

    // Displays the elements of the 2D array
    public static void display(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
                System.out.printf("%5d", arr[i][j]);

            System.out.println();
        }
    }

    // Displays the diagonal elements of the 2D array
    public static void displayDiagonals(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (i == j || j == arr.length - i - 1)
                    System.out.printf("%5d", arr[i][j]);
                else
                    System.out.print("    ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the no of rows and columns of the square matrix:");
        int row = sc.nextInt();
        int col = row;

        System.out.println("\nEnter the elements of the matrix:");
        int[][] mat = initArray(row, col);

        System.out.println("\nElements of the matrix:");
        display(mat);

        System.out.println("\nDiagonals of the matrix:");
        displayDiagonals(mat);
    }
}
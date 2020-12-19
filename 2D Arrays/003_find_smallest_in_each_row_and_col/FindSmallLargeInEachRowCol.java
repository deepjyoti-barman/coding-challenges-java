
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
 * It is built to write a menu driven program using switch case construct to input a M X N matrix and display it. Then perform the following operations based on user's choice:
 * - Display the largest element of each row
 * - Display the smallest element of each row
 * - Display the largest element of each col
 * - Display the smallest element of each col
 * 
 * @author Deepjyoti Barman
 * @since December 17, 2020
 */
class FindSmallLargeInEachRowCol
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

    // Returns the largest element in each row of the matrix
    public static void getLargestInEachRow(int[][] arr)
    {
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("\nLargest element in each row:");
        for (int i = 0; i < rows; i++)
        {
            int[] rowSet = new int[cols];

            for (int j = 0; j < cols; j++)
                rowSet[j] = arr[i][j];

            Arrays.sort(rowSet);
            System.out.println(rowSet[rowSet.length - 1]);
        }
    }

    // Returns the smallest element in each row of the matrix
    public static void getSmallestInEachRow(int[][] arr)
    {
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("\nSmallest element in each row:");
        for (int i = 0; i < rows; i++)
        {
            int[] rowSet = new int[cols];

            for (int j = 0; j < cols; j++)
                rowSet[j] = arr[i][j];

            Arrays.sort(rowSet);
            System.out.println(rowSet[0]);
        }
    }

    // Returns the largest element in each col of the matrix
    public static void getLargestInEachCol(int[][] arr)
    {
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("\nLargest element in each col:");
        for (int i = 0; i < cols; i++)
        {
            int[] colSet = new int[rows];

            for (int j = 0; j < rows; j++)
                colSet[j] = arr[j][i];

            Arrays.sort(colSet);
            System.out.printf("%5d", colSet[colSet.length - 1]);
        }
    }

    // Returns the smallest element in each col of the matrix
    public static void getSmallestInEachCol(int[][] arr)
    {
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("\nSmallest element in each col:");
        for (int i = 0; i < cols; i++)
        {
            int[] colSet = new int[rows];

            for (int j = 0; j < rows; j++)
                colSet[j] = arr[j][i];

            Arrays.sort(colSet);
            System.out.printf("%5d", colSet[0]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the no of rows of the array:");
        int row = sc.nextInt();
        System.out.println("Enter the no of columns of the array:");
        int col = sc.nextInt();

        System.out.println("\nEnter the elements of the array:");
        int[][] mat = initArray(row, col);

        System.out.println("\nElements of the array:");
        display(mat);
        
        System.out.println("\n1. Find the largest element of each row");
        System.out.println("2. Find the smallest element of each row");
        System.out.println("3. Find the largest element of each column");
        System.out.println("4. Find the smallest element of each column\n");

        System.out.println("Enter your choice:");
        int input = sc.nextInt();
        sc.close();

        switch (input)
        {
            case 1:
                getLargestInEachRow(mat);
                break;
            case 2:
                getSmallestInEachRow(mat);
                break;
            case 3:
                getLargestInEachCol(mat);
                break;
            case 4:
                getSmallestInEachCol(mat);
                break;
            default:
                System.out.println("Invalid input! given choice is out of range");
                System.out.println("Try running the program once again");
        }
    }
}
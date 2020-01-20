// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 19 (Sunday), 2020




import java.util.Scanner;

/**
 * It is built to verify couple of 2D arrays are identical (i.e. same) or different
 * 
 * @author Deepjyoti Barman
 * @since January 19, 2020
 */
class Verify2dArraysSameOrDiff
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

    // Verifies whether two given arrays are identical or not, returns true if same; else returns false if different
    public static boolean isEquals(int[][] arr1, int[][] arr2)
    {
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length)
        {
            for (int i = 0; i < arr1.length; i++)
            {       
                for (int j = 0; j < arr1[i].length; j++)
                {
                    if (arr1[i][j] != arr2[i][j])
                        return false;
                }
            }

            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the no of rows of the first array:");
        int row1 = sc.nextInt();
        System.out.println("Enter the no of columns of the first array:");
        int col1 = sc.nextInt();

        System.out.println("\nEnter the no of rows of the second array:");
        int row2 = sc.nextInt();
        System.out.println("Enter the no of columns of the second array:");
        int col2 = sc.nextInt();

        System.out.println("\nEnter the elements of the first array:");
        int[][] arr1 = initArray(row1, col1);

        System.out.println("\nEnter the elements of the second array:");
        int[][] arr2 = initArray(row2, col2);
        sc.close();

        System.out.println("\nElements of the first array:");
        display(arr1);

        System.out.println("\nElements of the second array:");
        display(arr2);
        
        if (isEquals(arr1, arr2))
            System.out.println("\nGiven 2D arrays are identical");
        else
            System.out.println("\nGiven 2D arrays are different");
    }
}
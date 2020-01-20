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
 * It is built to initialize and display all the elements of a 2D array
 * 
 * @author Deepjyoti Barman
 * @since January 19, 2020
 */
class InitAndDisplay2dArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of rows of the array:");
        int row = sc.nextInt();

        System.out.println("Enter the no of columns of the array:");
        int col = sc.nextInt();

        if (row < 1 || col < 1)
        {
            sc.close();
            throw new ArithmeticException("the row and col size of 2D array must be equal or greater than 1");
        }
            
        // Initializes the 2D array
        int[][] arr = new int[row][col];

        // Stores the elements into the 2D array taking inputs from user
        System.out.println("\nEnter the elements of the array:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }   
        }
        
        // Displaying the elements of the 2D array
        System.out.println("\nElements of the array are:");
        for (int[] i : arr)
        {
            for (int j : i)
                System.out.printf("%5d", j);

            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}
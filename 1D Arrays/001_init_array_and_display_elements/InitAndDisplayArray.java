// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 07 (Saturday), 2019




import java.util.Scanner;

/**
 * It is built to initialize and display all the elements of an array
 * 
 * @author Deepjyoti Barman
 * @since December 07, 2019
 */
class InitAndDisplayArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Initializes the array
        System.out.println("Enter the length of the array:");
        int[] arr = new int[sc.nextInt()];

        // Stores the elements into the array taking inputs from user
        System.out.println("\nEnter the elements of the array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        // Displaying the elements of the array
        System.out.println("\nElements of the array are:");
        for (int i : arr)
        {
            System.out.print(i + "  ");
        }
        System.out.println();

        sc.close();
    }
}
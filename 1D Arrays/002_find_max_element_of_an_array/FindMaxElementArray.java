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
 * It is built to find the maximum element of an array
 * 
 * @author Deepjyoti Barman
 * @since January 19, 2020
 */
class FindMaxElementArray
{
    static Scanner sc = new Scanner(System.in);

    // Creates an array, initializes its members and returns the array reference
    public static int[] initArray(int size)
    {
        // Initializes the array
        int[] arr = new int[size];

        // Stores the elements into the array taking inputs from user
        System.out.println("\nEnter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Returns the maximum element of the array
    public static int getMaxElement(int[] arr)
    {
        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > maxElement)
                maxElement = arr[i];
        }

        return maxElement;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array:");
        int[] arr = initArray(sc.nextInt());
        sc.close();

        int max = getMaxElement(arr);

        System.out.println("\nMaximum element of the array: " + max);
    }
}
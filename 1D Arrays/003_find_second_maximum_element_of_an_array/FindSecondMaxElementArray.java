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
 * It is built to find the second maximum element of an array (given than, length of the array >= 2)
 * 
 * @author Deepjyoti Barman
 * @since January 19, 2020
 */
class FindSecondMaxElementArray
{
    static Scanner sc = new Scanner(System.in);

    // Creates an array, initializes its members and returns the array reference
    public static int[] initArray(int size)
    {
        if (size < 2)
            throw new ArithmeticException("invalid length of array found, size of the array should be at least equal or greater than 2");

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

    // Returns the second maximum element of the array
    public static int getSecondMaxElement(int[] arr)
    {
        int firstMax, secondMax;
        firstMax = secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            // If the current array element is greater than firstMax, then update both firstMax and secondMax
            if (arr[i] > firstMax)
            {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            // If the current array element is in-between firstMax and secondMax, i.e. the element is greater than secondMax, but less than (or not equal to) firstMax
            // else if (arr[i] > secondMax && arr[i] < firstMax)
            else if (arr[i] > secondMax && arr[i] != firstMax)
                secondMax = arr[i];
        }
        
        return secondMax;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array:");
        int[] arr = initArray(sc.nextInt());
        sc.close();

        int secMax = getSecondMaxElement(arr);

        if (secMax == Integer.MIN_VALUE)
            System.out.println("\nThere is no second largest element in the array");
        else
            System.out.println("\nMaximum element of the array: " + secMax);
    }
}
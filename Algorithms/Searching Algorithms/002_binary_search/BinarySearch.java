// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 07 (Saturday), 2019




import java.util.Arrays;
import java.util.Scanner;

/**
 * It is built to demonstrate the use of Binary Search algorithm to find an element and its position if it is present in the array.
 * 
 * @author Deepjyoti Barman
 * @since December 07, 2019
 */
class BinarySearch
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

    // Searches for the given element in the array. If it is found then it returns the index or position of the element in the array; otherwise returns -1
    // NOTE: Binary Search algorithm works only if the array is sorted in ascending order
    /* NOTE:
        - Linear Search algorithm returns the position for the first occurrence of the element if it is present multiple times in the array
        - Binary Search algorithm returns a random position of the element's occurrence if it is present multiple times in the array (i.e. it may return the position of first occurrence or second occurrence or nth occurrence of the element)
        - Hence it is better to use Binary Search algorithm only in case of validating whether an element is present in the array or not
    */
    public static int binarySearch(int arr[], int first, int last, int key)
    {
        int mid = (first + last) / 2;

        while (first <= last)
        {
            if (arr[mid] < key)
                first = mid + 1;
            else if (arr[mid] == key)
                return mid;
            else
                last = mid - 1;

            mid = (first + last) / 2;
        }

        return -1;
    }

    // Prints the elements of the array
    public static void displayArray(int[] arr)
    {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++)
		{
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		System.out.print("]");
	}

    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array:");
        int[] arr = initArray(sc.nextInt());

        // Sorts the array elements in ascending order
        Arrays.sort(arr);
        System.out.println("\nInitial array:");
		displayArray(arr);

        System.out.println("\n\nEnter the key element to search:");
        int key   = sc.nextInt();
        sc.close();

        int position = binarySearch(arr, 0, arr.length - 1, key);
        if (position != -1)
            System.out.println("\nElement is found at index: " + position);  
        else
            System.out.println("\nElement is not found!");
    }
}
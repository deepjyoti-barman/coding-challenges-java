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
 * It is built to demonstrate the use of Linear Search algorithm to find an element and its position if it is present in the array.
 * 
 * @author Deepjyoti Barman
 * @since December 07, 2019
 */
class LinearSearch
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
    // NOTE: Linear Search algorithm returns the position for the first occurrence of the element if it is present multiple times in the array
    public static int linearSearch(int arr[], int key)
    {
        int index = 0;

        for (int element : arr)
        {
            if (element == key)
                return index;

            index++;
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

        System.out.println("\nInitial array:");
		displayArray(arr);

        System.out.println("\n\nEnter the key element to search:");
        int key   = sc.nextInt();
        sc.close();

        int position = linearSearch(arr, key);
        if (position != -1)
            System.out.println("\nElement is found at index: " + position);  
        else
            System.out.println("\nElement is not found!");
    }
}
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
 * It is built to demonstrate the use of Bubble Sort algorithm to sort an unsorted array in ascending and descending order
 * 
 * @author Deepjyoti Barman
 * @since December 07, 2019
 */
class BubbleSort
{
    static Scanner sc = new Scanner(System.in);

    // Swaps or replaces one element of the array with another
    public static void swap(int[] arr, int index1, int index2)
    {
        arr[index1] = arr[index1] + arr[index2] - (arr[index2] = arr[index1]);		
    }

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

    // Sorts the array in ascending order using Bubble Sort algorithm
	public static void bubbleSortAsc(int[] arr)
	{
		// Outer loop is used to calculate the total no of passes
		// No of pass = No of elements in the array - 1 (i.e. 5 elements = 4 passes)
		// After each pass one element is going to be placed in its proper position
		// i.e. After first pass the maximum element is going to placed into the last index of the array
		for (int i = 0; i < arr.length - 1; i++)
		{
			// Inner loop is used to perform comparisons with remaining unsorted elements of the array
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					swap(arr, j, j + 1);
				}
			}
		}
    }
    
    // Sorts the array in descending order using Bubble Sort algorithm
	public static void bubbleSortDesc(int[] arr)
	{
		// Outer loop is used to calculate the total no of passes
		// No of pass = No of elements in the array - 1 (i.e. 5 elements = 4 passes)
		// After each pass one element is going to be placed in its proper position
		// i.e. After first pass the minimum element is going to placed into the last index of the array
		for (int i = 0; i < arr.length - 1; i++)
		{
			// Inner loop is used to perform comparisons with remaining unsorted elements of the array
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (arr[j] < arr[j + 1])
				{
					swap(arr, j, j + 1);
				}
			}
		}
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

		bubbleSortAsc(arr);

		System.out.println("\n\nSorted array in ascending order:");
        displayArray(arr);
        
        bubbleSortDesc(arr);

        System.out.println("\n\nSorted array in descending order:");
        displayArray(arr);

        System.out.println();
        sc.close();
    }
}
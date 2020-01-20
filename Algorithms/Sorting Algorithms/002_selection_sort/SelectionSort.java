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
 * It is built to demonstrate the use of Selection Sort algorithm to sort an unsorted array in ascending and descending order
 * 
 * @author Deepjyoti Barman
 * @since December 07, 2019
 */
class SelectionSort
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

    // Sorts the array in ascending order using Selection Sort algorithm
	public static void selectionSortAsc(int[] arr)
	{
		// Outer loop is used to calculate the total no of passes
		// No of pass = No of elements in the array - 1 (i.e. 5 elements = 4 passes)
		// After each pass one element is going to be placed in its proper position
		// i.e. After first pass the minimum element is going to placed into the first index of the array
		for (int i = 0; i < arr.length - 1; i++)
		{
			int min_index = i;

			// Inner loop is used to perform comparisons with all the remaining members of the array
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[min_index] > arr[j])
					min_index = j;
			}

			// Swap only if, values of i and min_index are different
			// i.e. i and min_index pointing to two different elements of the array and not the same
			if (i != min_index)
				swap(arr, i, min_index);
		}
    }
    
    // Sorts the array in descending order using Selection Sort algorithm
	public static void selectionSortDesc(int[] arr)
	{
		// Outer loop is used to calculate the total no of passes
		// No of pass = No of elements in the array - 1 (i.e. 5 elements = 4 passes)
		// After each pass one element is going to be placed in its proper position
		// i.e. After first pass the maximum element is going to placed into the first index of the array
		for (int i = 0; i < arr.length - 1; i++)
		{
			int max_index = i;

			// Inner loop is used to perform comparisons with all the remaining members of the array
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[max_index] < arr[j])
					max_index = j;
			}

			// Swap only if, values of i and max_index are different
			// i.e. i and min_index pointing to two different elements of the array and not the same
			if (i != max_index)
				swap(arr, i, max_index);
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

		selectionSortAsc(arr);

		System.out.println("\n\nSorted array in ascending order:");
        displayArray(arr);
        
        selectionSortDesc(arr);

        System.out.println("\n\nSorted array in descending order:");
        displayArray(arr);

        System.out.println();
        sc.close();
    }
}
// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 26 (Sunday), 2020




import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * It is built to the display the duplicate elements of an array of type int (primitive)
 * 
 * @author Deepjyoti Barman
 * @since January 26, 2020
 */
class DispDupElementsIntArr
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

    // Returns an array containing the duplicate elements present in the given array
    public static int[] getDuplicates(int[] arr)
    {
        // Converting the array into a list
        ArrayList<Integer> originalList = new ArrayList<Integer>();
        for (int i : arr)
            originalList.add(i);

        // Converting the list into a set to remove duplicates
        TreeSet<Integer> nonDupSet = new TreeSet<Integer>(originalList);

        // Removing the non-duplicates from the list
        for (Integer element : nonDupSet)
        {
            originalList.remove(element);
        }

        // To retrieve the unique duplicate elements from the list convert in back to set once again
        TreeSet<Integer> dupSet = new TreeSet<Integer>(originalList);

        // Converts the set containing unique duplicate elements into an array and returns back the array
        int[] dupArr = new int[dupSet.size()];
        int index = 0;

        for (Integer element : dupSet)
            dupArr[index++] = element;
        
        return dupArr;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array:");
        int[] arr = initArray(sc.nextInt());
        sc.close();
        
        int[] duplicates = getDuplicates(arr);

        if (duplicates.length == 0)
            System.out.println("\nThere is no duplicate element in the array");
        else
            System.out.println("\nDuplicate elements of the array: " + Arrays.toString(duplicates));
    }
}
// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 28 (Tuesday), 2020




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * It is built to the display the duplicate elements of an array of type String (non-primitive)
 * 
 * @author Deepjyoti Barman
 * @since January 28, 2020
 */
class DispDupElementsStringArr
{
    static Scanner sc = new Scanner(System.in);

    // Creates an array, initializes its members and returns the array reference
    public static String[] initArray(int size)
    {
        // Initializes the array
        String[] arr = new String[size];

        // Stores the elements into the array taking inputs from user
        System.out.println("\nEnter the elements of the array (of type String):");
        for (int i = 0; i < size; i++)
        {
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.next();
        }

        return arr;
    }

    // Returns an array containing the duplicate elements present in the given array
    public static String[] getDuplicates(String[] arr)
    {
        // Converting the String array into a list
        ArrayList<String> originalList = new ArrayList<String>();
        Collections.addAll(originalList, arr);
        

        // Converting the list into a set to remove duplicates
        TreeSet<String> nonDupSet = new TreeSet<String>(originalList);

        // Removing the non-duplicates from the list
        for (String element : nonDupSet)
        {
            originalList.remove(element);
        }

        // To retrieve the unique duplicate elements from the list convert in back to set once again
        TreeSet<String> dupSet = new TreeSet<String>(originalList);

        // Converts the set containing unique duplicate elements into an array and returns back the array
        String[] dupArr = dupSet.toArray(new String[dupSet.size()]);
        
        return dupArr;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array:");
        String[] arr = initArray(sc.nextInt());
        sc.close();
        
        String[] duplicates = getDuplicates(arr);

        if (duplicates.length == 0)
            System.out.println("\nThere is no duplicate element in the array");
        else
            System.out.println("\nDuplicate elements of the array: " + Arrays.toString(duplicates));
    }
}
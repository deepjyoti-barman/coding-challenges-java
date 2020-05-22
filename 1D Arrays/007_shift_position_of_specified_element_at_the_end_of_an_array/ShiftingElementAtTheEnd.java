// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 22 (Friday), 2020




import java.util.Arrays;
import java.util.Scanner;

/**
 * It is built to shift the position of a specified element at the end of an array
 * Input  : [1, 2, 1, 4, 8, 5, 1, 9]
 *          1
 * Output : [2, 4, 8, 5, 9, 1, 1, 1]
 * 
 * Input  : [1, 2, 1, 4, 8, 5, 1, 9]
 *          6
 * Output : The element 6 is not present in the array
 *         
 * @author Deepjyoti Barman
 * @since March 19, 2020
 */
public class ShiftingElementAtTheEnd
{
    static Scanner sc = new Scanner(System.in);

    // Creates an array, initializes its members and returns the array reference
    public static int[] initArray(int size)
    {
        // Initializes the array
        int[] arr = new int[size];

        // Stores the elements into the array taking inputs from user
        System.out.println("\nEnter the elements of the array (of type int):");
        for (int i = 0; i < size; i++)
        {
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        return arr;
    }
    
    // Checks whether the given element is present in the array
    public static boolean isPresent(int key, int[] arr)
    {
        for (int element : arr)
        {
            if (key == element)
                return true;
        }

        return false;
    }
    
    // Shifts the position of the given element in the array at the end 
    public static void shiftPosAtEnd_Algo1(int key, int[] arr)
    {
        if (!isPresent(key, arr))
        {
            System.out.println("\nSORRY! The element " + key + " is not present in the array");
            System.exit(1);
        }
            
        for (int i = 0; i < arr.length; i++)
        {
            if (key == arr[i])
            {
                for (int j = i + 1; j < arr.length; j++)
                    arr[j - 1] = arr[j];
            }
                
            arr[arr.length - 1] = key;
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array:");
        int[] arr = initArray(sc.nextInt());
        
        System.out.println("\nEnter the integer that you want to shift to the end of the array:");
        int element = sc.nextInt();
        sc.close();
        
        shiftPosAtEnd_Algo1(element, arr);
        
        System.out.print("\nSUCCESS! After shifting '" + element + "' at the end of the array, new array: " + Arrays.toString(arr));
    }
}
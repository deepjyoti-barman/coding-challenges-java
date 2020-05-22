// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 22 (Friday), 2020




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * It is built to remove all the duplicate elements in an array.
 * 
 * Input  : [1, 2, 1, 3, 4, 1]
 * Output : [2, 3, 4]
 * 
 * @author Deepjyoti Barman
 * @since March 18, 2020
 */
public class DuplicateRemover
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
    
    // [Algorithm-1]: Returns an array removing the duplicate elements completely from the array
    public static int[] removeDuplicate_Algo1(int[] arr)
    {
        // Converting the int array into a list
        List<Integer> originalList     = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> copyOriginalList = IntStream.of(arr).boxed().collect(Collectors.toList());
        
        // Converting the list into a HashSet
        HashSet<Integer> uniqueElements = new HashSet<>(originalList);
        
        // Removing the unique elements to get the duplicate elements
        for (Integer i : uniqueElements)
            originalList.remove(i);
        
        // Removing the duplicate elements to get only the unique elements
        copyOriginalList.removeAll(originalList);
        
        return copyOriginalList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // [Algorithm-2]: Returns an array removing the duplicate elements completely from the array
    public static int[] removeDuplicate_Algo2(int[] arr)
    {
        // Converting the int array into a list
        List<Integer> originalList     = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> copyOriginalList = IntStream.of(arr).boxed().collect(Collectors.toList());
        List<Integer> listOfDuplicates = new ArrayList<>();
        
        // Sorting the duplicate list
        Collections.sort(copyOriginalList);
        
        for (int i = 0; i < copyOriginalList.size(); i++)
        {            
            for (int j = i + 1; j < copyOriginalList.size() && copyOriginalList.get(i) == copyOriginalList.get(j); j++)
            {
                if (!listOfDuplicates.contains(copyOriginalList.get(i)))
                    listOfDuplicates.add(copyOriginalList.get(i));
                
                // Updating the value of i to start with a new unique element
                i = j;
            }
        }
        
        // Removing the duplicate elements to get only the unique elements
        originalList.removeAll(listOfDuplicates);
     
        return originalList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // [Algorithm-3]: Returns an array removing the duplicate elements completely from the array
    public static int[] removeDuplicate_Algo3(int[] arr)
    {
        // Adding each element in the int array into a map which points to occurrence of each element
        LinkedHashMap<Integer, Integer> elementOccurMap = new LinkedHashMap<Integer, Integer>();
        
        for (int key : arr)
        {
            if (elementOccurMap.containsKey(key))
            {
                Integer value = elementOccurMap.get(key);
                elementOccurMap.put(key, ++value);
            }
            else
                elementOccurMap.put(key, 1);
        }
        
        // Extracting list of unique elements from the map
        ArrayList<Integer> uniqueElementsList = new ArrayList<Integer>(); 
        Set<Integer> keys = elementOccurMap.keySet();
        
        for (Integer key : keys)
        {
            Integer value = elementOccurMap.get(key);
            
            if (value == 1)
                uniqueElementsList.add(key);
        }
        
        return uniqueElementsList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array:");
        int[] arr = initArray(sc.nextInt());
        sc.close();
        
        int[] dupLessArr1 = removeDuplicate_Algo1(arr);
        System.out.println("\nArray without duplicates using first algorithm: " + Arrays.toString(dupLessArr1));
        
        int[] dupLessArr2 = removeDuplicate_Algo2(arr);
        System.out.println("Array without duplicates using second algorithm: " + Arrays.toString(dupLessArr2));
        
        int[] dupLessArr3 = removeDuplicate_Algo3(arr);
        System.out.println("Array without duplicates using third algorithm: " + Arrays.toString(dupLessArr3));
    }
}

/*
    NOTES: Java 8 - New Feature - Streams
    --------------------------------------
    // To boxed array
    Integer[] what = Arrays.stream(data).boxed().toArray(Integer[]::new);
    Integer[] ever = IntStream.of(data).boxed().toArray(Integer[]::new);
    
    // To boxed list
    List<Integer> you  = Arrays.stream(data).boxed().collect(Collectors.toList());
    List<Integer> like = IntStream.of(data).boxed().collect(Collectors.toList());
    
    // List to primitive array
    int[] arr1 = list.stream().mapToInt(Integer::intValue).toArray();
    int[] arr2 = list.stream().mapToInt((Integer i)->i.intValue()).toArray();
    int[] arr3 = list.stream().mapToInt((Integer i)->i).toArray();
    int[] arr4 = list.stream().mapToInt(i->i).toArray();
*/
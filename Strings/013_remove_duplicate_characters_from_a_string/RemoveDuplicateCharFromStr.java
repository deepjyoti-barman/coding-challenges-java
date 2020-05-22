// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : March 11 (Monday), 2020




import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * It is built to remove the duplicate characters from a string removing 
 *
 * @author Deepjyoti Barman
 * @since March 11, 2020
 */
class RemoveDuplicateCharFromStr
{
    // [Algorithm-1]: Removes the duplicate characters and return back a new string
    public static String removeDuplicates1(String str)
    {
        LinkedHashSet<Character> orderedCharSet = new LinkedHashSet<>();

        // Inserting all the characters present in the string to a LinkedHashSet to remove duplicates preserving order
        for (int i = 0; i < str.length(); i++)
            orderedCharSet.add(str.charAt(i));
        
        // Converting each character present in LinkedHashSet back to string    
        String strWithoutDuplicates = "";
        for (Character ch : orderedCharSet)
            strWithoutDuplicates = strWithoutDuplicates + ch;

        return strWithoutDuplicates;
    }

    // [Algorithm-2]: Removes the duplicate characters and return back a new string
    public static String removeDuplicates2(String str)
    {
        char[] charArr = str.toCharArray();

        // Adding each character into the ArrayList if the character does not pre-exist in the ArrayList
        ArrayList<Character> charList = new ArrayList<Character>();
        for (char ch : charArr)
        {
            if (!charList.contains(ch))
                charList.add(ch);
        }

        // Converting each character present in ArrayList back to string
        String strWithoutDuplicates = "";
        for (Character ch : charList)
            strWithoutDuplicates = strWithoutDuplicates + ch;

        return strWithoutDuplicates;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        System.out.println("\nAfter removing the duplicate characters, new string using first algorithm:\n" + removeDuplicates1(str));

        System.out.println("\nAfter removing the duplicate characters, new string using second algorithm:\n" + removeDuplicates2(str));
    }
}
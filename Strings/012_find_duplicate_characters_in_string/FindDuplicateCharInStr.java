// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : March 02 (Monday), 2020




import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a program to find the duplicate characters in a string.
 *
 * @author Deepjyoti Barman
 * @since March 02, 2020
 */
class FindDuplicateCharInStr
{
    public static ArrayList<Character> getDuplicateChars(String str)
    {
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++)
		{
            if (charCountMap.containsKey(charArr[i]))
		    {
                Integer value = charCountMap.get(charArr[i]);
                charCountMap.put(charArr[i], ++value);
		    }
            else
                charCountMap.put(charArr[i], 1);
		}

        ArrayList<Character> duplicateChars = new ArrayList<>();
        Set<Character> keys = charCountMap.keySet();
		for (Character key : keys)
		{
			if (charCountMap.get(key) > 1)
				duplicateChars.add(key);
        }
        
        return duplicateChars;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        ArrayList<Character> duplicateChars = getDuplicateChars(str);

        System.out.println("\nDuplicate characters in the string: " + duplicateChars);
    }
}

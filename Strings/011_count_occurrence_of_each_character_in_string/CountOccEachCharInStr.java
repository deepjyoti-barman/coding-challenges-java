// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : March 02 (Monday), 2020




import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * Write a program to count the occurrence of each character in a string.
 *
 * @author Deepjyoti Barman
 * @since March 02, 2020
 */
class CountOccEachCharInStr
{
    public static LinkedHashMap<Character, Integer> countOccurOfEachChar(String str)
    {
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            Character ch = str.charAt(i);

            if (charCountMap.containsKey(ch))
            {
                Integer value = charCountMap.get(ch);
                charCountMap.put(ch, ++value);
            }
            else
                charCountMap.put(ch, 1);
        }

        return charCountMap;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        LinkedHashMap<Character, Integer> charCountMap = countOccurOfEachChar(str);

        System.out.println("\nOccurrence of all characters in string:");
        Iterator<Entry<Character, Integer>> entries = charCountMap.entrySet().iterator();
        while(entries.hasNext())
        {
            Entry<Character, Integer> keyValuePair = entries.next();
            System.out.println(keyValuePair.getKey() + " = " + keyValuePair.getValue());
        }
    }
}

// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 13 (Friday), 2019




import java.util.Arrays;
import java.util.Scanner;

/**
 * It is built to check whether two given strings are anagram or not (ignoring case)
 * 
 * <p>Two strings are said to be anagram if both the strings are having
 * same set of characters same no of times [i.e. LiStEn and SiLEnT are anagram]</p>
 * 
 * @author Deepjyoti Barman
 * @since December 13, 2019
 */
class AnagramValidator
{
    // [Algorithm-1]: Checks whether the given two strings are anagram or not without using in-built methods
    public static boolean isAnagram1(String s1, String s2)
    {
        if (s1.length() == s2.length())
        {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            for (int i = 0; i < charArray1.length; i++)
            {
                if (charArray1[i] != charArray2[i])
                    return false;
            }

            return true;
        }

        return false;
    }

    // [Algorithm-2]: Checks whether the given two strings are anagram or not using Arrays.equals()
    public static boolean isAnagram2(String s1, String s2)
    {
        if (s1.length() == s2.length())
        {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2))
                return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        sc.close();

        // Checks given two strings are anagram or not ignoring case
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        if (isAnagram2(str1, str2))
            System.out.println("\nWOW! it's a match " + str1 + " and " + str2 + " are anagram");
        else
            System.out.println("\nSORRY! " + str1 + " and " + str2 + " are not anagram");
    }
}
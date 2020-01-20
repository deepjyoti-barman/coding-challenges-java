// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 12 (Thursday), 2019




import java.util.Scanner;

/**
 * It is built to count the number of vowels present in a string
 * 
 * @author Deepjyoti Barman
 * @since December 12, 2019
 */
class CountVowelOccurString
{
    // Counts the number of vowels present in the given string
    public static int countVowels(String str)
    {
        int vCount = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vCount++;                
        }

        return vCount;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine().trim();
        sc.close();

        int occurrence = countVowels(str.toLowerCase());

        if (occurrence != 0)
            System.out.println("\nVowels count in the string: " + occurrence);
        else
            System.out.println("\nVowels not found in the string");
    }
}

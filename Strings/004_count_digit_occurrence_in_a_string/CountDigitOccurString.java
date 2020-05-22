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
 * It is built to count the number of digits present in a string
 * 
 * @author Deepjyoti Barman
 * @since December 12, 2019
 */
class CountDigitOccurString
{
    // Counts the number of digits present in the given string
    public static int countDigits(String str)
    {
        int dCount = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                dCount++;                
        }

        return dCount;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine().trim();
        sc.close();

        int occurrence = countDigits(str);

        if (occurrence != 0)
            System.out.println("\nDigits count in the string: " + occurrence);
        else
            System.out.println("\nNo digits found");
    }
}

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
 * It is built to read a sentence as well as character from user and check whether the given character is present in the sentence. If the character is present then print its number of occurrence; else print "Given character is not present in the sentence"
 * 
 * @author Deepjyoti Barman
 * @since December 12, 2019
 */
class CountCharOccurString
{
    // Counts the occurrence of given character in the string
    public static int countPresence(String str, char ch)
    {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
                count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().trim();

        System.out.println("\nEnter a character:");
        char ch = sc.next().charAt(0);
        System.out.println();
        sc.close();

        int occurrence = countPresence(sentence, ch);
        if (occurrence == 1)
            System.out.println("'" + ch + "' is present " + occurrence + " time in '" + sentence + "'");
        else if (occurrence > 1)
            System.out.println("'" + ch + "' is present " + occurrence + " times in '" + sentence + "'");
        else
            System.out.println("'" + ch + "' is not present in '" + sentence + "'");
    }
}

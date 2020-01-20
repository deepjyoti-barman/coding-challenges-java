// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 15 (Sunday), 2019




import java.util.Scanner;

/**
 * It is built to count the number of extra whitespace present in between a sentence. There is not need to count extra whitespace present at the leading or trailing position of the sentence.
 * 
 * <p>If the whitespace count is 1 in between two words consider it as a normal whitespace, but if the whitespace count is 2 or more than that consider it in the category of extra whitespace</p>
 * 
 * @author Deepjyoti Barman
 * @since December 15, 2019
 */
class CountExtraWhitespaceInBetween
{
    // Counts the number of extra whitespace present in between the given string
    public static int countExtraWhitespace(String str)
    {
        char[] charArray = str.trim().toCharArray();
        int extWsCount = 0;

        for (int i = 0; i < charArray.length; i++)
        {
            // Marks the starting index of the word
            int start_index = i;

            // As long as we are getting characters other than whitespace keep on traversing forward
            // First condition is used to avoid ArrayIndexOutOfBoundsException
            while (i < charArray.length && charArray[i] != ' ')
                i++;

            // The moment we encounter a whitespace that moment we will able to identify the ending index of the word
            int end_index = i - 1;

            // start_index > end_index, means it is an extra whitespace (i.e. whitespace followed by another whitespace)
            // start_index = end_index, means it is a one character word
            // start_index < end_index, means it is a multi-character word
            // Checks if it is a extra whitespace
            if (start_index > end_index)
                extWsCount++;
        }

        return extWsCount;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        sc.close();

        int noExtraWhitespace = countExtraWhitespace(str);
        System.out.println("\nExtra whitespace count in the sentence: " + noExtraWhitespace);
    }
}

// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 15 (Sunday), 2019




import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * It is built to count the no of words present in a sentence
 *
 * @author Deepjyoti Barman
 * @since December 15, 2019
 */
class CountNoOfWords
{
    // [Algorithm-1]: Counts the no of words in the given string using split() method of String class
    // \s is a character class used in a regular expression to detect whitespace including tabs
    // \s+ will be able to detect one or more occurrences of whitespace or tabs and split the string accordingly
    public static int countWords1(String str)
    {
        String[] strArray = str.trim().split("\\s+");
        return strArray.length;
    }

    // [Algorithm-2]: Counts the no of words in the given string using StringTokenizer class
    // StringTokenizer uses the default delimiter set, which is " \t\n\r\f": the space character, the tab character, the newline character, the carriage-return character and the form-feed character
    public static int countWords2(String str)
    {
        StringTokenizer tokens = new StringTokenizer(str.trim());
        return tokens.countTokens();
    }

    // [Algorithm-3]: Counts the no of words in the given string
    public static int countWords3(String str)
    {
        char[] charArray = str.trim().toCharArray();
        int wc = 0;

        for (int i = 0; i < charArray.length; i++)
        {
            // Marks the starting index of the word
            int start_index = i;

            // As long as we are getting characters other than whitespace / tab keep on traversing forward
            // First condition is used to avoid ArrayIndexOutOfBoundsException
            while (i < charArray.length && charArray[i] != ' ' && charArray[i] != '\t')
                i++;

            // The moment we encounter a whitespace / tab that moment we will able to identify the ending index of the word
            int end_index = i - 1;

            // start_index > end_index, means it is an extra whitespace / tab (i.e. whitespace followed by another whitespace / tab followed by another tab / whitespace followed by tab / tab followed by whitespace)
            // start_index = end_index, means it is a one character word
            // start_index < end_index, means it is a multi-character word
            // Checks if it is a word
            if (start_index <= end_index)
                wc++;
        }

        return wc;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        sc.close();

        int noOfWords = countWords1(str);
        System.out.println("\nWord count in the sentence: " + noOfWords);
    }
}

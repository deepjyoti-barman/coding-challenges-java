// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 14 (Saturday), 2019




import java.util.Scanner;

/**
 * It is built to convert a string into initcap case or title case [i.e. first letter of all the words present in the string will capitalized]
 * 
 * @author Deepjyoti Barman
 * @since December 14, 2019
 */
class StringConvertTitleCase
{
    // [Algorithm-1]: Converts a given string to initcap case or title case
    public static String toTitleCase1(String str)
    {
        char[] charArray = str.trim().toCharArray();

        for (int i = 0; i < charArray.length; i++)
        {
            // Checks if the character is the first character of the word
            // First condition: The character is the first character of the string and it is not a whitespace / tab (to avoid ArrayIndexOutOfBoundsException)
            // Second / primary condition: The character is not an whitespace / tab but the previous character is a whitespace / tab
            if ((i == 0 && !(charArray[i] == ' ' || charArray[i] == '\t')) || 
                (!(charArray[i] == ' ' || charArray[i] == '\t') && charArray[i - 1] == ' ' || charArray[i - 1] == '\t'))
            {
                // Converts the character to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
            // If the character is not the first character of the word then converts it to lowercase
            else
            {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }

        return new String(charArray);
    }

    // [Algorithm-2]: Converts a given string to initcap case or title case
    public static String toTitleCase2(String str)
    {
        char[] charArray = str.trim().toCharArray();

        for (int i = 0; i < charArray.length; i++)
        {
            // Marks the starting index of the word
            int start_index = i;

            // As long as we are getting characters other than whitespace / tab keep on traversing forward
            // First condition is used to avoid ArrayIndexOutOfBoundsException
            while (i < charArray.length && !(charArray[i] == ' ' || charArray[i] == '\t'))
                i++;

            // The moment we encounter a whitespace / tab that moment we will be able to identify the ending index of the word
            int end_index = i - 1;

            // start_index > end_index, means it is an extra whitespace / tab (i.e. whitespace followed by another whitespace / tab followed by another tab / whitespace followed by tab / tab followed by whitespace)
            // start_index = end_index, means it is a one character word
            // start_index < end_index, means it is a multi-character word
            // Checks if it is a word
            if (start_index <= end_index)
            {
                // Converts the initial character of the word to uppercase if it is in lowercase
                if (charArray[start_index] >= 'a' && charArray[start_index] <= 'z')
                {
                    charArray[start_index] = (char) (charArray[start_index] - 32);
                }

                // Converts the rest of the characters of the word to lowercase if they are in uppercase
                for (int j = start_index + 1; j <= end_index; j++)
                {
                    if (charArray[j] >= 'A' && charArray[j] <= 'Z')
                        charArray[j] = (char) (charArray[j] + 32);
                }
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        String titleCaseStr = toTitleCase2(str);
        System.out.println("\nThe string in title case:\n" + titleCaseStr);        
    }
}

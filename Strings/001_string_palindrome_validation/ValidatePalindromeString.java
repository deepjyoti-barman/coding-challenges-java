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
 * It is built to check whether the given string is palindrome or not
 * 
 * @author Deepjyoti Barman
 * @since December 12, 2019
 */
class ValidatePalindromeString
{
    // [Algorithm-1]: Returns the reverse of given string
    public static String reverseStr1(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    // [Algorithm-2]: Returns the reverse of given string
    public static String reverseStr2(String str)
    {
        String reverse = "";
        char[] chars = str.toCharArray();

        for (char ch : chars)
            reverse = ch + reverse;
    
        return reverse;
    }

    // [Algorithm-3]: Returns the reverse of given string
    public static String reverseStr3(String str)
    {
        String reverse = "";
    
        for (int i = str.length() - 1; i >= 0; i--) 
            reverse = reverse + str.charAt(i);

        return reverse;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        String reversedString = reverseStr3(str);

        if (str.equalsIgnoreCase(reversedString))
            System.out.println("WOW! you have entered a palindrome");
        else
            System.out.println("SORRY! given string is not a palindrome");
    }
}

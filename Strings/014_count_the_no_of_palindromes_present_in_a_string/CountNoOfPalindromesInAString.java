// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 20, 2020 (Wednesday), 2020




import java.util.Scanner;

/**
 * It is built to count the no of palindromes present in a string if we split the string into substring having minimum of 2 characters
 * 
 * Input  : abccba
 * Output : 3
 * 
 * [Hint: "abccba" = palindrome, "bccb" = palindrome, "cc" = palindrome. Hence in total 3 palindromes are there in the given string.]
 * 
 * @author Deepjyoti Barman
 * @since March 29, 2020
 */
public class CountNoOfPalindromesInAString
{
    static Scanner scan = new Scanner(System.in);
    
    // Returns a boolean value depending on the whether the given string is palindrome or not
    public static boolean isPalindrome(String str)
    {
        String strRev = new StringBuilder(str).reverse().toString();
        
        return str.equals(strRev) ? true : false;
    }
    
    // Counts the no of palindromes present in the given string, if we split the string into substring having minimum of 2 characters 
    public static int countPalindromeInStr(String str)
    {
        int palindromeCount = 0;
        
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i + 2; j <= str.length(); j++)
            {
                if (isPalindrome(str.substring(i, j)))
                    palindromeCount++;
            }
        }
     
        return palindromeCount;
    }
    
    public static void main(String[] args)
    {
        System.out.print("Enter any string: ");
        String str = scan.nextLine();
        scan.close();
        
        int totalPalindromeCount = countPalindromeInStr(str);
        System.out.println("\nTotal palindrome count: " + totalPalindromeCount);
    }
}
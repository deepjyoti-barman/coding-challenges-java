/* Platform             : QSpiders
 * Branch Location      : Bengaluru
 * Branch Name          : Basavanagudi
 * Course Code          : QCCM11
 * Course Name          : Java SE/Core Java
 * Faculty              : Mr. Dixith SN
 * Author               : Deepjyoti Barman
 * Date                 : December 11 (Wednesday), 2019
 */




import java.util.Scanner;

/**
 * It is built to reverse a string using recursion
 * 
 * @author Deepjyoti Barman
 * @since December 11, 2019
 */
class ReverseAStringRecursive
{
    // Returns the reverse of a string
    public static String reverse(String str)
    {
        if (str.isEmpty())
            return "";
        else
            return reverse(str.substring(1)) + str.substring(0, 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        String reversedString = reverse(str);

        System.out.println("Output: " + reversedString);
    }
}
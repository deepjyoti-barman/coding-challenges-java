/* Platform             : QSpiders
 * Branch Location      : Bengaluru
 * Branch Name          : Basavanagudi
 * Course Code          : QCCM11
 * Course Name          : Java SE/Core Java
 * Faculty              : Mr. Dixith SN
 * Author               : Deepjyoti Barman
 * Date                 : January 18 (Saturday), 2020
 */




import java.util.Scanner;

/**
 * It is built to spilt a given number N in between into two parts, reverse both parts then concatenate them to form a new number and print the new number as output (given that, N > 0 and number is of type int)
 *
 * @author Deepjyoti Barman
 * @since January 18, 2020
 */

class SplitNumAndReverse
{
    // Splits the number, finds the reverse of each part, concatenates them and returns the new number
    public static int splitAndReverse(int num)
    {
        // String numStr = String.valueOf(num);
        // String numStr = new StringBuffer().append(num).toString(); 
        // String numStr = new StringBuilder().append(num).toString();
        // String numStr = new Integer(num).toString();
        String numStr = Integer.toString(num);
        int length    = numStr.length();

        String numPart1 = numStr.substring(0, length / 2);
        String numPart2 = numStr.substring(length / 2);

        String numPart1Reversed = new StringBuilder(numPart1).reverse().toString();
        String numPart2Reversed = new StringBuilder(numPart2).reverse().toString();

        return Integer.parseInt(numPart1Reversed + numPart2Reversed);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number greater than 0:");
        int num = sc.nextInt();
        sc.close();

        int newNum = splitAndReverse(num);
        System.out.println("\nThe new number after split and reverse: " + newNum);
    }
}

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
 * It is built to find the maximum digit of a number N (given that, N > 0 and N is of type int).
 *
 * @author Deepjyoti Barman
 * @since January 18, 2020
 */

class FindMaxDigitOfNum
{
    // Returns the maximum digit present in the given number
    public static int getMaxDigit(int num)
    {
        if (num <= 0)
            throw new ArithmeticException("number can't be less than or equal to zero");

        int max = num % 10;

        while (num != 0)
        {
            int last_digit = num % 10;

            if (last_digit > max)
                max = last_digit;
            
            num = num / 10;
        }

        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number greater than 0:");
        int n = sc.nextInt();
        sc.close();

        int maxDigit = getMaxDigit(n);
        System.out.println("\nThe maximum digit present in " + n + ": " + maxDigit);
    }
}

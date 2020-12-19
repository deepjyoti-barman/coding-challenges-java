// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 31, 2020 (Sunday), 2020




import java.util.Scanner;

/**
 * It is built to print prime numbers from 1 to N (using recursive approach)
 * 
 *   Input: 20
 *  Output: 2 3 5 7 11 13 17 19
 * 
 * @author Deepjyoti Barman
 * @since May 31, 2020
 */
public class PrintPrimeNosFrom1ToN
{
    static Scanner scan = new Scanner(System.in);

    // Returns the a boolean value analyzing whether the number is prime or not prime
    static boolean isPrime(int num, int divisor)
    {
        if (divisor == 1)
            return true;
        if (num % divisor == 0)
            return false;
        else
            return isPrime(num, divisor - 1);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the value of N: ");
        final int N = scan.nextInt();
        scan.close();

        System.out.println("\nPrime numbers from 1 to " + N + ": ");
        for (int i = 2; i <= N; i++)
        {
            if (isPrime(i, i / 2))
                System.out.print(i + " ");
        }
    }
}
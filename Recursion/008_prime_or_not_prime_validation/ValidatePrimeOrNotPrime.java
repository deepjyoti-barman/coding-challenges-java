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
 * It is built to validate whether a number is prime or not prime (using recursive approach)
 * 
 *   Input-1: 5
 *  Output-1: Prime
 * 
 *   Input-2: 27
 *  Output-2: Not Prime
 * 
 * @author Deepjyoti Barman
 * @since May 31, 2020
 */
public class ValidatePrimeOrNotPrime
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
        System.out.print("Enter the number to validate: ");
        int num = scan.nextInt();
        scan.close();

        if (isPrime(num, num / 2))
            System.out.println("\nThe number " + num + " is a prime number");
        else
            System.out.println("\nThe number " + num + " is not a prime number");
    }
}
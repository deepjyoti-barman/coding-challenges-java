// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 18 (Saturday), 2020




import java.util.Scanner;

/**
 * It is built to calculate and print the factorial of a number using recursion
 * 
 * @author Deepjyoti Barman
 * @since January 18, 2020
 */
class FactorialOfNum
{
    // Calculates and returns the factorial of given number
    public static int factorial(int num)
    {
        if (num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();

        int result= factorial(n);

        System.out.println("\nFactorial of " + n + ", i.e. " + n + "! = " + result);
    }
}
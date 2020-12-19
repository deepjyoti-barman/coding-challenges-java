// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 25, 2020 (Monday), 2020




import java.util.Scanner;

/**
 * It is built to find the Nth term of fibonacci series (using recursive approach)
 * 
 *   Input-1: 5
 *  Output-1: 5
 * 
 *   Input-2: 10
 *  Output-2: 55
 * 
 * @author Deepjyoti Barman
 * @since May 25, 2020
 */
public class NthTermOfFibonacciSeries
{
    static Scanner scan = new Scanner(System.in);

    // Returns the nth term of Fibonacci series
    static int getNthFibTerm(int pos)
    {
        if (pos <= 1)
            return pos;
        else
            return getNthFibTerm(pos - 1) + getNthFibTerm(pos - 2);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter positional value (n) to discover the term: ");
        int position = scan.nextInt();
        scan.close();

        int term = getNthFibTerm(position);

        System.out.println("\nThe term at position " + position + " in Fibonacci series: " + term);
    }
}
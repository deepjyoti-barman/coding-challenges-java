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
 * It is built to generate fibonacci series upto the Nth term (using recursive approach)
 * 
 *   Input-1: 5
 *  Output-1: 0 1 1 2 3 5
 * 
 *   Input-2: 10
 *  Output-2: 0 1 1 2 3 5 8 13 21 34 55
 * 
 * @author Deepjyoti Barman
 * @since May 25, 2020
 */
public class GenFibSeriesUptoNthTerm
{
    static Scanner scan = new Scanner(System.in);

    // Recursive algorithm that returns the nth term of Fibonacci series
    static int getNthFibTerm(int pos)
    {
        if (pos == 0)
            return 0;
        else if (pos == 1)
            return 1;
        else
            return getNthFibTerm(pos - 1) + getNthFibTerm(pos - 2);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the positional value (n) to expand the series: ");
        int position = scan.nextInt();
        scan.close();

        System.out.println("Fibonacci series upto position " + position + " :");
        for (int i =  0; i <= position; i++)
        {
            System.out.print(getNthFibTerm(i) + "    ");
        }
    }
}
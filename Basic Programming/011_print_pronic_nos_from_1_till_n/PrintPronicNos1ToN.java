// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 20 (Sunday), 2020




import java.util.Scanner;

/**
 * It is built to display all the pronic numbers from 1 to n and also count how many pronic numbers are there in between the given range.
 * Note: A pronic number / rectangular number / oblong number is a number which is represented by the product of two consecutive numbers, that is a number of the form "n x (n + 1)"
 * e.g. 
 *  0 x 1 = 0
 *  1 x 2 = 2
 *  2 x 3 = 6
 *  3 x 4 = 12
 *  ...
 *  
 * @author Deepjyoti Barman
 * @since December 20, 2020
 */
class PrintPronicNos1ToN
{
    static Scanner sc = new Scanner(System.in);

    // Prints the pronic numbers and return the count of pronic numbers available in the given range
    public static int getPronic(int eLimit)
    {
        int begLimit = 1;
        int pCount   = 0;

        while (true)
        {
            int currentPronicNo = begLimit * ++begLimit;

            if (currentPronicNo <= eLimit)
            {
                System.out.printf("%d x %d = %d\n", begLimit - 1, begLimit, currentPronicNo);
                pCount++;
            }
            else
                break;
        }

        return pCount;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the value of n:");
        int endLimit = sc.nextInt();
        sc.close();

        System.out.printf("\nPronic numbers from 1 to %d:\n", endLimit);
        int pronicCount = getPronic(endLimit);
        if (pronicCount == 0)
            System.out.printf("\nThere are no pronic numbers available in between the given range");
        else
            System.out.printf("\nThere are %d pronic numbers available in between the given range", pronicCount);
    }
}
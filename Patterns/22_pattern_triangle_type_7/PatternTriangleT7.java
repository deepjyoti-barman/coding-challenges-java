// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : March 01 (Sunday), 2020




import java.util.Scanner;

/**
 * It is built to generate the following program, when the number of rows N = 4
 * 
 *           1
 *         3 2
 *       6 5 4
 *    10 9 8 7
 * 
 * @author Deepjyoti Barman
 * @since March 01, 2020
 */
class PatternTriangleT7
{
    static Scanner sc = new Scanner(System.in);

    // [Algorithm-1]: Creates the pattern
    public static void drawPattern1(int n)
    {
        int count = 1;

        for (int i = 0; i < n; i++)
        {
            int pattern = count + i;

            for (int j = 0; j < n; j++)
            {
                if (i + j >= n - 1)
                {
                    System.out.printf("%3d", pattern--);
                    count++;
                }
                else
                    System.out.printf("%3s", " ");
            }

            System.out.println();
        }
    }

    // [Algorithm-2]: Creates the pattern
    public static void drawPattern2(int n)
    {
        int count = 1;

        for (int i = 0; i < n; i++)
        {
            int temp_count = count;

            // Print the white-space
            for (int j = 0; j < n - i - 1; j++)
                System.out.printf("%3s", " ");

            // Increment `count` and `temp_count` but not printing anyone of them
            for (int j = 0; j <= i; j++)
            {
                temp_count++;
                count++;
            }

            // Decrement `temp_count` while printing it
            for (int j = 0; j <= i; j++)
                System.out.printf("%3d", --temp_count);
            
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter for how many row(s) you want to expand the pattern:");
        int n = sc.nextInt();
        System.out.println();
        sc.close();
        
        System.out.println("Pattern using first algorithm:");
        drawPattern1(n);

        System.out.println("\nPattern using second algorithm:");
        drawPattern2(n);
    }
}
// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : March 08 (Sunday), 2020




import java.util.Scanner;

/**
 * It is built to generate the following program, when the number of rows N = 4
 * 
 *             1
 *           1 2 1
 *         1 2 3 2 1
 *       1 2 3 4 3 2 1
 *     1 2 3 4 5 4 3 2 1
 * 
 * @author Deepjyoti Barman
 * @since March 08, 2020
 */
class PatternTriangleT8
{
    static Scanner sc = new Scanner(System.in);

    // [Algorithm-1]: Creates the pattern
    public static void drawPattern1(int n)
    {
        int spaces  = n - 1;
        int pattern_to_print = 1;

        for (int i = 0; i < n; i++)
        {
            int count = 1;

            for (int j = 0; j < spaces; j++)
                System.out.print("  ");

            for (int k = 0; k < pattern_to_print; k++)
            {
                if (k < pattern_to_print / 2)
                    System.out.print(count++ + " ");
                else if (k == pattern_to_print / 2)
                    System.out.print(count + " ");
                else
                    System.out.print(--count + " ");
            }

            spaces--;
            pattern_to_print = pattern_to_print + 2;
            System.out.println();
        }
    }

    // [Algorithm-2]: Creates the pattern
    public static void drawPattern2(int n)
    {
        for (int i = 0; i < n; i++)
        {
            int count = 0;

            for (int j = 0; j < n - i -1; j++)
                System.out.print("  ");

            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print((k <= i) ? ++count + " " : --count + " ");
            
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
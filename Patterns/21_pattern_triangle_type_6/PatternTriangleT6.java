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
 * It is built to generate the following program, when the number of rows N = 5
 * 
 *           *
 *         * * *
 *       * * * * *
 *     * * * * * * * *
 *   * * * * * * * * * *
 * 
 * @author Deepjyoti Barman
 * @since March 01, 2020
 */
class PatternTriangleT6
{
    static Scanner sc = new Scanner(System.in);

    // [Algorithm-1]: Creates the pattern
    public static void drawPattern1(int n)
    {
        int spaces = n - 1;
        int stars  = 1;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < spaces; j++)
                System.out.print("  ");

            for (int k = 0; k < stars; k++)
                System.out.print("* ");

            spaces--;
            stars = stars + 2;
            System.out.println();
        }
    }

    // [Algorithm-2]: Creates the pattern
    public static void drawPattern2(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("  ");
            
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("* ");

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
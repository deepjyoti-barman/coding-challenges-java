// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : February 27 (Thursday), 2020




import java.util.Scanner;

/**
 * It is built to generate the following program, when the number of rows N = 5
 * 
 *      * * * * *
 *        *   *
 *          *
 *        *   *
 *      * * * * *
 * 
 * @author Deepjyoti Barman
 * @since February 27, 2020
 */
class PatternSquareT15
{
    static Scanner sc = new Scanner(System.in);

    // Creates the pattern
    public static void drawPattern(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j || i + j == n - 1 || i == 0 || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter for how many row(s) you want to expand the pattern:");
        int n = sc.nextInt();
        System.out.println();
        sc.close();
        
        System.out.println("Pattern:");
        drawPattern(n);
    }
}
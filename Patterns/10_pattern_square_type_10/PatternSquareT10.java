// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : February 03 (Monday), 2020




import java.util.Scanner;

/**
 * It is built to generate the following program, when the number of rows N = 5
 * 
 *      1 2 3 4 5
 *      5 4 3 2 1
 *      1 2 3 4 5
 *      5 4 3 2 1
 *      1 2 3 4 5
 * 
 * @author Deepjyoti Barman
 * @since February 03, 2020
 */
class PatternSquareT10
{
    static Scanner sc = new Scanner(System.in);

    // [Algorithm-1]: Creates the pattern, using an extra variable
    public static void drawPattern1(int n)
    {
        int pattern = 1;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i % 2 == 0)
                    System.out.print(pattern++ + " ");
                else
                    System.out.print(--pattern + " ");
            }

            System.out.println();
        }
    }

    // [Algorithm-2]: Creates the pattern, without using any extra variable
    public static void drawPattern2(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i % 2 == 0)
                    System.out.print(j + 1 + " ");
                else
                    System.out.print(n - j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter for how many row you want to expand the pattern:");
        int n = sc.nextInt();
        System.out.println();
        sc.close();
        
        System.out.println("Pattern using first algorithm:");
        drawPattern1(n);
        
        System.out.println("\nPattern using second algorithm:");
        drawPattern2(n);
    }
}
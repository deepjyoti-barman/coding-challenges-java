// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 25 (Saturday), 2020




import java.util.Scanner;

/**
 * It is built to generate the following program, when the number of rows N = 5
 * 
 *      0 1 0 1 0
 *      0 1 0 1 0
 *      0 1 0 1 0
 *      0 1 0 1 0
 *      0 1 0 1 0
 * 
 * @author Deepjyoti Barman
 * @since January 25, 2020
 */
class PatternSquareT3
{
    static Scanner sc = new Scanner(System.in);

    // Algorithm-1: Creates the pattern
    public static void drawPattern1(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j % 2 == 0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }

            System.out.println();
        }
    }

    // Algorithm-2: Creates the pattern
    public static void drawPattern2(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(j % 2 + " ");

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
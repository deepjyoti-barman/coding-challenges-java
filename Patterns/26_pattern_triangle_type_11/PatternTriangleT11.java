// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : March 11 (Tuesday), 2020




import java.util.Scanner;

/**
 * It is built to generate the following program, when the number of rows N = 5
 *          5 4 3 2 1
 *           4 3 2 1
 *            3 2 1
 *             2 1
 *              1
 * 
 * @author Deepjyoti Barman
 * @since March 11, 2020
 */
class PatternTriangleT11
{
    static Scanner sc = new Scanner(System.in);

    // [Algorithm-1]: Creates the pattern
    public static void drawPattern1(int n)
    {
        for (int i = 0; i < n; i++)
        {
            int count = n - i;
       
            for (int j = n - 1; j >= 0; j--)
            {
                if (i + j <= n - 1)
                    System.out.print(count-- + " ");
                else
                    System.out.print(" ");
            }
           
            System.out.println();
        }
    }

    // [Algorithm-2]: Creates the pattern
    public static void drawPattern2(int n)
    {   
        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
               
            for (int k = 0; k <= i; k++)
                System.out.print(i + 1 - k + " ");
           
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
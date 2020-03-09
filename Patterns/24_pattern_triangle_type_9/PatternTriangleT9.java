// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : March 09 (Monday), 2020




import java.util.Scanner;

/**
 * It is built to generate the following program, when the number of rows N = 5
 *          1
 *          2 1
 *          3 2 1
 *          4 3 2 1
 *          5 4 3 2 1
 * 
 * @author Deepjyoti Barman
 * @since March 09, 2020
 */
class PatternTriangleT9
{
    static Scanner sc = new Scanner(System.in);

    // [Algorithm-1]: Creates the pattern
    public static void drawPattern1(int n)
    {
        for (int i = 0; i < n; i++)
        {
            int count = i + 1;
           
            for (int j = 0; j < n; j++)
            {
                if (i >= j)
                    System.out.print(count-- + " ");
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
            for (int j = 0; j <= i; j++)
                System.out.print(count - j + " ");
            
            count++;           
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
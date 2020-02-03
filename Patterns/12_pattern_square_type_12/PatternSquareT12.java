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
 *      1 a 2 b 3
 *      4 c 5 d 6
 *      7 e 8 f 9
 *      1 a 2 b 3
 *      4 c 5 d 6
 * 
 * @author Deepjyoti Barman
 * @since February 03, 2020
 */
class PatternSquareT12
{
    static Scanner sc = new Scanner(System.in);

    // Creates the pattern
    public static void drawPattern(int n)
    {
        int pattern1  = 1;
        char pattern2 = 'a';

        for (int i = 0; i < n; i++)
        {
            if (pattern1 > 9)
            {
                pattern1 = 1;
                pattern2 = 'a';
            }

            for (int j = 0; j < n; j++)
            {
                if (j % 2 == 0)
                    System.out.print(pattern1++ + " ");
                else
                    System.out.print(pattern2++ + " ");
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
        
        System.out.println("Pattern:");
        drawPattern(n);
    }
}
// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 29 (Wednesday), 2020




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * It is built to print numbers from 1 to N which are divisible by 3 and 5
 * 
 * @author Deepjyoti Barman
 * @since January 29, 2020
 */
class PrintNosDivisibleBy3And5
{
    static Scanner sc = new Scanner(System.in);

    // Returns an array of numbers which are divisible by both 3 and 5 in between 1 to N
    public static int[] getDivisibleNumbers(int n)
    {
        ArrayList<Integer> divisibleNosList = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
                divisibleNosList.add(i);
        }

        int[] divisibleNosArr = new int[divisibleNosList.size()];
        for (int i = 0; i < divisibleNosArr.length; i++)
            divisibleNosArr[i] = divisibleNosList.get(i);

        return divisibleNosArr;
    }

    public static void main(String[] args)
    {
        System.out.println("The lower limit of range has been set to 1");
        System.out.println("Enter upper limit - N, (N > 1):");
        int n = sc.nextInt();
        sc.close();

        int[] arrDivisibleNos = getDivisibleNumbers(n);
        
        System.out.println("\nNumbers in between 1 to " + n + " which are divisible by 3 and 5:\n" + Arrays.toString(arrDivisibleNos));
    }
}
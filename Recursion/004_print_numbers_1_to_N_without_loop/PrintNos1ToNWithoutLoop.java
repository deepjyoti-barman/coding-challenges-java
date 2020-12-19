// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 23 (Thursday), 2020




import java.util.Scanner;

/**
 * It is built to print numbers from 1 to N without using any loop (using recursive approach)
 * 
 * @author Deepjyoti Barman
 * @since January 23, 2020
 */
class PrintNos1ToNWithoutLoop
{
    // [Algorithm-1]: Prints numbers from 1 to N without any loop
    public static void printNos1(int num)
    {
        if (num == 0)
            return;
        else
            printNos1(num - 1);

        System.out.println(num);
    }

    // [Algorithm-2]: Prints numbers from 1 to N without any loop
    public static void printNos2(int num)
    {
        if (num != 1)
            printNos2(num - 1);
        
        System.out.println(num);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        sc.close();

        System.out.println("\nPrinting 1 to " + n + " using first algorithm:");
        printNos1(n);

        System.out.println("\nPrinting 1 to " + n + " using second algorithm:");
        printNos2(n);
    }
}
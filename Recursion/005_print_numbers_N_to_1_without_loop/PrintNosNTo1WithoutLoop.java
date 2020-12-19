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
 * It is built to print numbers from N to 1 without using any loop (using recursive approach)
 * 
 * @author Deepjyoti Barman
 * @since January 23, 2020
 */
class PrintNosNTo1WithoutLoop
{
    // [Algorithm-1]: Prints numbers from N to 1 without any loop
    public static void printNos1(int num)
    {
        System.out.println(num);

        if (num == 1)
            return;
        else
            printNos1(num - 1);
    }

    // [Algorithm-2]: Prints numbers from N to 1 without any loop
    public static void printNos2(int num)
    {
        System.out.println(num);

        if (num != 1)
            printNos2(num - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        sc.close();

        System.out.println("\nPrinting " + n + " to 1 using first algorithm:");
        printNos1(n);

        System.out.println("\nPrinting " + n + " to 1 using second algorithm:");
        printNos2(n);
    }
}
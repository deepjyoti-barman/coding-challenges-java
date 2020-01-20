// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 18 (Saturday), 2020




import java.util.Scanner;

/**
 * It is built to print a message n times without using any loop, using a recursive method
 * 
 * @author Deepjyoti Barman
 * @since January 18, 2020
 */
class PrintMsgNTimesNoLoop
{
    // [Algorithm-1]: Prints a message for the given no of time
    public static void printMsg1(String msg, int noOfTimeToPrint)
    {
        System.out.println(msg);

        if (noOfTimeToPrint == 1)
            return;
        else
            printMsg1(msg, noOfTimeToPrint - 1);
    }

    // [Algorithm-2]: Prints a message for the given no of time
    public static void printMsg2(String msg, int noOfTimeToPrint)
    {
        if (noOfTimeToPrint == 0)
            return;
        else
            printMsg2(msg, noOfTimeToPrint - 1);
            
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a message:");
        String str = sc.nextLine();

        System.out.println("Enter the no of times you are willing to print it:");
        int n = sc.nextInt();
        sc.close();

        System.out.println("\nPrinting the message " + n + " times for the first time");
        printMsg1(str, n);

        System.out.println("\nPrinting the message " + n + " times for the second time");
        printMsg2(str, n);
    }
}
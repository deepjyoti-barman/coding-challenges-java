// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 20, 2020 (Sunday), 2020




import java.util.Scanner;

/**
 * It is built to find the binary equivalent of a decimal number (using recursive approach)
 * 
 *   Input: 23
 *  Output: 10111
 * 
 * @author Deepjyoti Barman
 * @since December 20, 2020
 */
public class FindBinaryOfADecNum
{
    static Scanner scan = new Scanner(System.in);

    // [Algorithm-1]: Returns the binary equivalent of a decimal number
    public static String decToBin1(int n)
    {
        String bin = "";

        while (n != 0)
        {
            int rem = n % 2;
            bin = rem + bin;
            n   = n / 2;
        }

        return bin;
    }

    // [Algorithm-2]: Returns the binary equivalent of a decimal number (recursive approach)
    public static String decToBin2(int num)
    {
        if (num == 0) 
            return "";

        return decToBin2(num / 2) + num % 2;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the decimal number:");
        int num = scan.nextInt();
        scan.close();

        System.out.println("\nBinary Equivalent using first algorithm: " + decToBin1(num));
        System.out.println("Binary Equivalent using second algorithm: " + decToBin2(num));
    }
}
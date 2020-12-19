// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 16 (Wednesday), 2020




import java.util.Scanner;

/**
 * It is built to write a menu driven program using switch case construct that converts a decimal number into its equivalent Binary, Octal and Hexadecimal (Assume an integer input).
 * 
 * e.g.
 *  Press 1 for Dec to Bin
 *  Press 2 for Dec to Oct
 *  Press 3 for Dec to Hexadecimal
 * 
 *  Enter your choice:
 *  1
 *  Enter the number:
 *  10
 *  Binary Equivalent: 1010
 * 
 * @author Deepjyoti Barman
 * @since December 16, 2020
 */
class DecToBinOctHex
{
    static Scanner sc = new Scanner(System.in);

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

    // Returns the binary equivalent of a decimal number
    public static String decToOct(int n)
    {
        String oct = "";

        while (n != 0)
        {
            int rem = n % 8;
            oct = rem + oct;
            n   = n / 8;
        }

        return oct;
    }

    // Returns the binary equivalent of a decimal number
    public static String decToHex(int n)
    {
        String hex = "";

        while (n != 0)
        {
            int rem = n % 16;

            switch (rem)
            {
                case 10:
                    hex = 'A' + hex;
                    break;
                case 11:
                    hex = 'B' + hex;
                    break;
                case 12:
                    hex = 'C' + hex;
                    break;
                case 13:
                    hex = 'D' + hex;
                    break;
                case 14: 
                    hex = 'E' + hex;
                    break;
                case 15:
                    hex = 'F' + hex;
                    break;
                default:
                    hex = rem + hex;
            }

            n   = n / 16;
        }
        
        return hex;
    }

    public static void main(String[] args)
    {
        System.out.println("Press 1 for Dec to Bin");
        System.out.println("Press 2 for Dec to Oct");
        System.out.println("Press 3 for Dec to Hexadecimal\n");
        System.out.println("Enter your choice:");
        int input = sc.nextInt();

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        sc.close();
                
        switch (input)
        {
            case 1:
                System.out.println("Binary Equivalent: " + decToBin2(num));
                break;
            case 2:
                System.out.println("Octal Equivalent: " + decToOct(num));
                break;
            case 3:
                System.out.println("Hexadecimal Equivalent: " + decToHex(num));
                break;
            default:
                System.out.println("Invalid input! given choice is out of range");
                System.out.println("Try running the program once again");
        }
    }
}
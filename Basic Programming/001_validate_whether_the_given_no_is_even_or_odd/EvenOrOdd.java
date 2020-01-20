/* Platform             : QSpiders
 * Branch Location      : Bengaluru
 * Branch Name          : Basavanagudi
 * Course Code          : QCCM11
 * Course Name          : Java SE/Core Java
 * Faculty              : Mr. Dixith SN
 * Author               : Deepjyoti Barman
 * Date                 : January 18 (Saturday), 2020
 */




import java.util.Scanner;

/**
 * It is built to validate whether the given number is even or odd
 * 
 * @author Deepjyoti Barman
 * @since January 18, 2020
 */
class EvenOrOdd
{
    // Validates whether the number is even or odd. If the number is even returns true; else returns false
    public static boolean isEven(int num)
    {
        if (num % 2 == 0)
            return true;
        
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        sc.close();

        System.out.println("\nThe number " + n + (isEven(n) ? " is even" : " is odd"));
    }
}

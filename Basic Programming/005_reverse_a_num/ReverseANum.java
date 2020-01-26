// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 26 (Sunday), 2020




import java.util.Scanner;

/**
 * It is built to reverse a number N and print it in console (N > 0)
 * 
 * @author Deepjyoti Barman
 * @since January 26, 2020
 */
class ReverseANum
{
    static Scanner sc = new Scanner(System.in);

    // [Algorithm-1]: Returns the reverse of a number
    public static int revNum1(int n)
    {
        int rev = 0;

        for (int temp = n; temp != 0; temp = temp / 10)
            rev = rev * 10 + (temp % 10);

        return rev;
    }

    // [Algorithm-2]: Returns the reverse of a number
    public static int revNum2(int n)
    {
        // Converts the integer into a string
        String strNum = Integer.toString(n);

        // Reverses the string value of the number
        String strNumRev = new StringBuilder(strNum).reverse().toString();

        // Returns the reversed string value of the number converting it back into an integer
        return Integer.parseInt(strNumRev);
    }
    
    public static void main(String[] args)
    {
        System.out.println("Enter an integer N, (N > 0):");
        int n = sc.nextInt();
        sc.close();
        
        int reverse1 = revNum1(n);
        int reverse2 = revNum2(n);

        System.out.println("\nReverse of the given number using first algorithm: " + reverse1);
        System.out.println("Reverse of the given number using second algorithm: " + reverse2);
    }
}
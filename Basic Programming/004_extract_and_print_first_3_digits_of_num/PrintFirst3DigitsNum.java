// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : January 25 (Saturday), 2020




import java.util.Scanner;

/**
 * Given a number N extract its first 3 digits and display it in console (N >= 100)
 * 
 * @author Deepjyoti Barman
 * @since January 25, 2020
 */
class PrintFirst3DigitsNum
{
    static Scanner sc = new Scanner(System.in);

    // Algorithm-1: Extracts and returns the first three digits of the number
    public static int extractDigits1(int n)
    {
        // String strNum = String.valueOf(n);
        String strNum = Integer.toString(n);

        if (strNum.length() < 3)
            throw new ArithmeticException("the number has to be at least a 3 digit number, it cannot be less than 100");

        String threeInitialDigits = strNum.substring(0, 3);

        return Integer.parseInt(threeInitialDigits);
    }

    // Algorithm-2: Extracts and returns the first three digits of the number
    public static int extractDigits2(int n)
    {
        int noOfDigits = 0;
    
        for (int temp = n; temp != 0; temp = temp / 10)
            noOfDigits++;
        
        if (noOfDigits < 3)
            throw new ArithmeticException("the number has to be at least a 3 digit number, it cannot be less than 100");

        int divisor = (int) Math.pow(10, noOfDigits - 3);

        return n / divisor;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Enter an integer N, (N >= 100):");
        int n = sc.nextInt();
        sc.close();
        
        int threeDigitNo1 = extractDigits1(n);
        System.out.println("\nFirst 3 digits of given number using first algorithm: " + threeDigitNo1);

        int threeDigitNo2 = extractDigits2(n);
        System.out.println("\nFirst 3 digits of given number using second algorithm: " + threeDigitNo2);
    }
}
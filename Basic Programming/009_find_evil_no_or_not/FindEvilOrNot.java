// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 18 (Friday), 2020




import java.util.Scanner;

/**
 * It is built to write program and check whether the given number is an evil number or not. 
 * Note: A number is considered to be an Evil number if the binary equivalent of the whole number is having even number of 1's in it.
 * e.g. 3, 5, 6, 9, 15 etc. [5 = 0 1 0 1, 9 = 1 0 0 1]
 * 
 * @author Deepjyoti Barman
 * @since December 18, 2020
 */
class FindEvilOrNot
{
    static Scanner sc = new Scanner(System.in);

    // Returns the binary equivalent of the decimal number given
    public static int decToBin(int num)
    {
        if (num == 0) 
            return 0;

        return decToBin(num / 2) * 10 + num % 2;
    }

    // Returns true / false calculating whether the given number is evil or not
    public static boolean isEvil(int num)
    {
        int bin = decToBin(num);
        int count = 0;

        while (bin > 0)
        {
            if (bin % 10 == 1)
                count++;

            bin /= 10;
        }

        return (count % 2 == 0) ? true : false;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a positive whole number:");
        int num = sc.nextInt();
        sc.close();

        if (isEvil(num))
            System.out.printf("\n%d [bin = %d] is an Evil number", num, decToBin(num));
        else
            System.out.printf("\n%d [bin = %d] is not an Evil number", num, decToBin(num));
    }
}
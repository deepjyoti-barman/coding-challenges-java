// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 20 (Sunday), 2020




import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * It is built to write program and check whether the given number is a unique number or not.
 * Note: A unique number is a positive integer (without leading zeros) with no duplicate digits.
 * e.g. 
 *  7, 135, 214 etc. are unique numbers
 *  99, 171, 3301 etc are not unique numbers 
 * 
 * @author Deepjyoti Barman
 * @since December 20, 2020
 */
class FindUniqueOrNot
{
    static Scanner sc = new Scanner(System.in);

    // Returns true / false calculating whether the given number is unique or not
    public static boolean isUnique(int num)
    {
        String numStr  = Integer.toString(num);
        char[] charArr = numStr.toCharArray();
        int charArrLen = charArr.length;

        // Converting char[] to Character[]
        Character[] charObjArr        = numStr.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        HashSet<Character> charObjSet = new HashSet<>(Arrays.asList(charObjArr));
        int charObjSetLen             = charObjSet.size();

        return (charArrLen == charObjSetLen) ? true : false;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a positive integer number:");
        int num = sc.nextInt();
        sc.close();

        if (isUnique(num))
            System.out.printf("\n%d is a unique number", num);
        else
            System.out.printf("\n%d is not a unique number", num);
    }
}
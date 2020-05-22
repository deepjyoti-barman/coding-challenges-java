// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 22, 2020 (Friday), 2020




import java.util.Scanner;

/**
 * It is built to transform the string in following order
 * 
 *   Input: I love Java and Selenium
    Output: Selenium dna Java evol I
 * 
 * @author Deepjyoti Barman
 * @since May 22, 2020
 */
public class TransformAStringIntoAnother1
{
    static Scanner scan = new Scanner(System.in);

    // Returns the reverse of the given string
    static String strRev(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    // [Algorithm-1]: Transforms the given string into another
    static String transform1(String str)
    {
        String transformedStr = "";
        String[] strArr = strRev(str).split("\\s");

        for (int i = 0; i < strArr.length; i++)
        {
            if (i % 2 == 0)
                transformedStr += strRev(strArr[i]) + " ";
            else
                transformedStr += strArr[i] + " ";
        }

        return transformedStr;
    }

    // [Algorithm-2]: Transforms the given string into another
    static String transform2(String str)
    {
        String transformedStr = "";
        String[] strArr = str.split("\\s");

        for (int i = strArr.length - 1; i >= 0; i--)
        {
            if (i % 2 == 0)
                transformedStr += strArr[i] + " ";
            else
                transformedStr += strRev(strArr[i]) + " ";
        }

        return transformedStr;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter any string: ");
        String str = scan.nextLine();
        scan.close();

        String newStr1 = transform1(str);
        String newStr2 = transform2(str);

        System.out.println("\nThe transformed string using first algorithm: " + newStr1);
        System.out.println("The transformed string using second algorithm: " + newStr2);
    }
}
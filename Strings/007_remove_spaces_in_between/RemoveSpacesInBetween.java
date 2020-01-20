// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 14 (Saturday), 2019




import java.util.Scanner;

/**
 * It is built to remove all whitespace and tab(s) present in a sentence [i.e. it will remove any leading whitespace / tab, trailing whitespace / tab or whitespace / tab present in between of two words]
 * 
 * @author Deepjyoti Barman
 * @since December 14, 2019
 */
class RemoveSpacesInBetween
{
    // [Algorithm-1]: Removes any leading, trailing and in-between whitespace / tab(s) from the given string
    public static String removeSpaces1(String str)
    {
        String noSpaceStr = "";
        
        for (int i = 0; i < str.length(); i++)
        {
            if (!(str.charAt(i) == ' ' || str.charAt(i) == '\t'))
                noSpaceStr = noSpaceStr + str.charAt(i);
        }

        return noSpaceStr;
    }

    // [Algorithm-2]: Removes any leading, trailing and in-between whitespace / tab(s) from the given string using split() method of String class
    // \s is a character class used in a regular expression to detect whitespace including tabs
    // \s+ will be able to detect one or more occurrences of whitespace or tabs and split the string accordingly
    public static String removeSpaces2(String str)
    {
        String[] strArr = str.trim().split("\\s+");
        String noSpaceStr = "";

        for (String s : strArr)
        {
            noSpaceStr = noSpaceStr + s;
        }

        return noSpaceStr;
    }

    // [Algorithm-3]: Removes any leading, trailing and in-between whitespace / tab(s) from the given string using replaceAll() method of String class
    public static String removeSpaces3(String str)
    {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        sc.close();

        String spaceLessStr = removeSpaces1(str);
        System.out.println("\nNew sentence without any spaces:\n" + spaceLessStr);
    }
}
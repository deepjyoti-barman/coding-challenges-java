// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 09 (Monday), 2019





import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * It is built to check whether the given password is valid or not, follows a certain pattern or not
 * 
 *<pre>
 *A password is considered to be valid if it satisfies the following conditions:
 *  - The length of the password should be at least 8 characters
 *  - It should contain at least one uppercase alphabet
 *  - It should contain at least one digit
 *  - It should contain at least one special character
 *  - It should not contain whitespace as character
 *</pre>
 * 
 * @author Deepjyoti Barman
 * @since December 09, 2019
 */
class PasswordValidator
{
    // [Algorithm-1]: Password validation via regular expression
    public static boolean validate1(String pwd)
    {
        // \d :  Any digits, short of [0-9]
        // \s :  Any whitespace character
        // \w :  Any word character, short for [a-zA-Z_0-9]
        // \W :  Any non-word character, short for [^\w]
        // [Regex-1]
        // String password_regex = "(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9\\s])[a-zA-Z_\\d[^\\w\\s]]{8,}";
        // String password_regex = "(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9\\s])[^\\s]{8,}";

        // [Regex-2]
        String password_regex = "(?=.{8,})(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9\\s])[^\\s]*";

        // [Process-1]
        // boolean isValid = Pattern.compile(password_regex).matcher(pwd).matches();

        // [Process-2]
        boolean isValid = Pattern.matches(password_regex, pwd);

        return isValid;
    }

    // [Algorithm-2]: Password validation via range of logical conditions
    public static boolean validate2(String pwd)
    {
        int uppercase = 0;
        int digits = 0;
        int whitespace = 0;
        int special_characters = 0;
        
        if (pwd.length() < 8)
            return false;

        for (int i = 0; i < pwd.length(); i++)
        {
            // Checks for the range of alphabets [A-Za-z]
            if ((pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') || (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z'))
            {
                // Among all alphabets checking for the range of uppercase alphabets
                if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z')
                    uppercase++;
            }
            // Checks for the range of digits [0-9]
            else if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9')
                digits++;
            // Checks for the whitespace
            else if (pwd.charAt(i) == ' ')
                whitespace++;
            // Checks for the range of remaining characters [i.e. all special characters]
            else
                special_characters++;
        }

        if (uppercase >= 1 && digits >= 1 && special_characters >= 1 && whitespace == 0)
            return true;
        else 
            return false;
    }

    // [Algorithm-3]: Password validation via separate logical conditions
    public static boolean validate3(String pwd)
    {
        if (hasEightOrMoreChars(pwd) && hasUpperCase(pwd) && hasDigit(pwd) && hasSpecialChar(pwd) && !hasWhitespace(pwd))
            return true;
        else
            return false;
    }

    // Checks if the string has at least 8 characters
    public static boolean hasEightOrMoreChars(String str)
    {
        if (str.length() >= 8)
            return true;
        else
            return false;
    }

    // Checks if the string has at least one uppercase alphabet
    public static boolean hasUpperCase(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                return true;
        }

        return false;
    }

    // Checks if the string has at least one digit
    public static boolean hasDigit(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                return true;
        }

        return false;
    }

    // Checks if the string has at least one space
    public static boolean hasWhitespace(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
                return true;
        }

        return false;
    }

    // Checks if the string has at least one special character
    public static boolean hasSpecialChar(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == ' '))
                return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the password:");
        String password = sc.nextLine();
        sc.close();
        
        if (validate1(password))
            System.out.println("\nCONGRATULATIONS! the password is valid");
        else
            System.out.println("\nERROR! The password is invalid");
    }
}
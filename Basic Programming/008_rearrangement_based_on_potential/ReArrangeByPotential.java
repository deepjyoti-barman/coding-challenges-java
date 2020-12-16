// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : December 16 (Wednesday), 2020




import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * The encryption of alphabets is to be done as follows:
 * 
 * A = 1, B = 2, C = 3... Z = 26
 * 
 * The potential of a word is found by adding the encrypted value of the alphabets.
 * e.g.
 *  KITE = 11 + 9 + 20 + 5 = 45
 * 
 * Accept a sentence which is terminated by either ".", "?" or "!". Each word of sentence is separated by a single space. Decode the words according to their potential and arrange them in ascending order.
 * 
 * e.g.
 *  INPUT: THE SKY IS THE LIMIT.
 *  OUTPUT: IS THE THE SKY LIMIT
 * [Potential: IS = 28, THE = 33, THE = 33, SKY = 55, LIMIT = 63]
 * 
 * @author Deepjyoti Barman
 * @since December 16, 2020
 */
class ReArrangeByPotential
{
    static Scanner sc = new Scanner(System.in);

    // Returns the encrypted character value for each character
    public static int decode(char c)
    {
        int value = (int) c - 64;
        return value;
    }

    // Returns the potential values of each word
    public static int getPotential(String word)
    {
        int potential = 0;
        char[] arr = word.toCharArray();

        for (char c : arr)
            potential = potential + decode(c);

        return potential;
    }

    // Rearranges the words on the basis of their potential value
    public static void rearrange(String sen)
    {
        String[] words = sen.split(" ");
        HashMap<Integer, String> potentialMap = new HashMap<>();
        ArrayList<Integer> potentialList = new ArrayList<>();

        for (String word : words)
        {
            int potential = getPotential(word);

            potentialMap.put(potential, word);
            potentialList.add(potential);
        }
        
        Collections.sort(potentialList);

        System.out.print("OUTPUT: ");
        for (Integer i : potentialList)
            System.out.print(potentialMap.get(i) + " ");
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the sentence (that ends with '.', '!' or '?'):");
        String sentence = sc.nextLine().toUpperCase();
        sc.close();

        if (sentence.endsWith(".") || sentence.endsWith("!") || sentence.endsWith("?"))
        {
            System.out.println("\nINPUT: " + sentence);
            sentence = sentence.replaceAll("[.!?]", "");
            rearrange(sentence);
        }
        else
        {
            System.out.println("Invalid input! sentence does not end with '.', '!' or '?'");
            System.out.println("Try running the program once again");
        }
    }
}
package chap07;

//********************************************************************
//  LetterCount.java       Java Foundations
//
//  Demonstrates the relationship between arrays and strings.
//  
//  Test Case:
//    In Casablanca, Humphrey Bogart never says "Play it again, Sam."
//********************************************************************

import java.util.Scanner;

public class LetterCount
{
   //-----------------------------------------------------------------
   //  Reads a sentence from the user and counts the number of
   //  uppercase and lowercase letters contained in it.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int NUMCHARS = 26;

      Scanner scan = new Scanner (System.in);

      int[] upper = new int[NUMCHARS];
      int[] lower = new int[NUMCHARS];

      char current;   // the current character being processed
      int other = 0;  // counter for non-alphabetics

      System.out.println ("Enter a sentence:");
      String line = scan.nextLine();

      //  Count the number of each letter occurrence
      for (int ch = 0; ch < line.length(); ch++)
      {
         current = line.charAt(ch);
         /*if (current >= 'A' && current <= 'Z')
            upper[current-'A']++;
         else
            if (current >= 'a' && current <= 'z')
               lower[current-'a']++;
            else
               other++;*/
         if(Character.isUpperCase(current))
        	 upper[current-'A']++;
         else if(Character.isLowerCase(current))
                lower[current-'a']++;
             else
                other++;
      }

      //  Print the results
      System.out.println ();
      for (int letter=0; letter < upper.length; letter++)
      {
         System.out.print ((char) (letter + 'A'));
         System.out.print (": " + upper[letter]);
         System.out.print ("\t\t" + (char) (letter + 'a'));
         System.out.println (": " + lower[letter]);
      }

      System.out.println ();
      System.out.println ("Non-alphabetic characters: " + other);
   }
}

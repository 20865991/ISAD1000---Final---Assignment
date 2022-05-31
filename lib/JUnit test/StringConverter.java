import java.util.*;
import java.lang.*;

public class StringConverter
{
		public static String convertString (String input)
		{
		
			String upper, lower, newWord;
			newWord = "";
           		
			if(input.equals(input.toLowerCase()))
           	{ 
			newWord = input.toUpperCase();
			System.out.print("The uppercase conversion is: " + newWord);	
			}

			else if (input.equals(input.toUpperCase()))
           	{ 
			newWord = input.toLowerCase();
			System.out.print("The lowercase conversion is: " + newWord);
			}	

			return newWord;
		}

}
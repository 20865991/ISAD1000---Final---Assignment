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
			System.out.println("The uppercase conversion is: " + newWord);	
			}

			else if (input.equals(input.toUpperCase()))
           	{ 
			newWord = input.toLowerCase();
			System.out.println("The lowercase conversion is: " + newWord);
			}	

			return newWord;
		}

		public static void main(String[] args)
		{ 
			Scanner sc = new Scanner(System.in);
			String str; 
			System.out.println("PLease enter a word");
			str = sc.next();

			StringConverter.convertString(str);
			
		}

}
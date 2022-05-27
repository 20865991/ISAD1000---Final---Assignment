import java.util.*;
import java.lang.*;

public class StringConverter
{
		public static String convertString (String input)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please enter u for uppercase conversion or l for lowercase conversion");
			char choice = sc.next().charAt(0);
		
			String upper, lower, newWord;
			newWord = "";
           		
			if (choice == 'u')
           	{ 
			newWord = utils.toUpper(input);	
			}

			else if (choice == 'l')
           	{ 
			newWord = utils.toLower(input);
			}	

			return newWord;
		}

}
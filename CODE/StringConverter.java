import java.util.*;

public class StringConverter
{
		public static String convertString (String input)
		{
			Scanner sc = new Scanner(System.in);
			
			String upper, lower, newWord;
            char choice;
			newWord = "";

			System.out.print("Please input u for an uppercase conversion or input l for lowercase conversion\n");
			choice = sc.next().charAt(0);
           		
			if (choice == 'u')
           	{ 
			System.out.print("Please enter a lowercase word: ");

			lower = sc.next();

			newWord = utils.toUpper(lower);	
			}

			else if (choice == 'l')
           	{ 
			System.out.print("Please enter an uppercase word: ");
			upper = sc.next();
 
			newWord = utils.toLower(upper);
			}	

			return newWord;
		}

}
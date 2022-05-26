import java.util.*;

public class StringConverter
{
	public static String toUpper(String lower)
	{ 
		String upperCase;

		upperCase = lower.toUpperCase();
		System.out.println("The uppercase  conversion is:  " + upperCase);

		return upperCase;
	}

	public static String toLower(String upper)
	{ 
		String lowerCase;

		lowerCase = upper.toLowerCase();
		System.out.println("The uppercase  conversion is:  " + lowerCase);

		return lowerCase;
	}
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			String upper, lower;
            char choice;

			System.out.print("Please input u for an uppercase conversion or input l for lowercase conversion\n");
			choice = sc.next().charAt(0);
           		
			if (choice == 'u')
           	{ 
			System.out.print("Please enter a lowercase word: ");

			lower = sc.next();

			String fromLowerCase = StringConverter.toUpper(lower);	
			}

			else if (choice == 'l')
           	{ 
			System.out.print("Please enter an uppercase word: ");
			upper = sc.next();
 
			String fromUpperCase = StringConverter.toLower(upper);
			}
		
	}

}
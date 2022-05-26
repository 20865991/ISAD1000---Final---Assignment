import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class removingNumericCharacters 
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        
        char choice;
        String str, upper, lower; 
        System.out.println("Please enter a string");
        str = sc.next();

        String regex = "[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        String newWord = (matcher.replaceAll("")); 
        
		System.out.print("Please input u for an uppercase conversion or input l for lowercase conversion\n");
		choice = sc.next().charAt(0);
           		
			if (choice == 'u')
           	{ 

			String fromLowerCase = StringConverter.toUpper(newWord);
		   	}

			else if (choice == 'l')
           	{ 
 
			String fromUpperCase = StringConverter.toLower(newWord);

            }        
    }
}

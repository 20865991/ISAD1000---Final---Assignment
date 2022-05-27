import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class removeNumbers 
{
    public static String removingNumbers (String str)
    { 
        Scanner sc = new Scanner(System.in);
        
        char choice;
        String stringResult = "";

        String regex = "[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        String newWord = (matcher.replaceAll("")); 
        
		System.out.print("Please input u for an uppercase conversion or input l for lowercase conversion\n");
		choice = sc.next().charAt(0);
           		
			if (choice == 'u')
           	{ 
			stringResult = utils.toUpper(newWord);
		   	}

			else if (choice == 'l')
           	{ 
			stringResult = utils.toLower(newWord);
            }     

        return stringResult;   
    }
}

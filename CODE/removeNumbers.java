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
        
            if(newWord.equals(newWord.toLowerCase()))
           	{ 
			stringResult = newWord.toUpperCase();
		   	}

            if(newWord.equals(newWord.toUpperCase()))
           	{ 
			stringResult = newWord.toLowerCase();
            }     

        return stringResult;   
    }
}

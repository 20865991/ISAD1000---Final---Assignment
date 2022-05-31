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

        str = (matcher.replaceAll("")); 
        
            if(str.equals(str.toLowerCase()))
           	{ 
			stringResult = str.toUpperCase();
		   	}

            if(str.equals(str.toUpperCase()))
           	{ 
			stringResult = str.toLowerCase();
            }     
            System.out.println("This is the new string without numbers is " + stringResult); 
        
            return stringResult;  
        
    }
}

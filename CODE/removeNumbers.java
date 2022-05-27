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

    public static void main (String[] args)
    { 
    
        assert "tay".equals(removeNumbers.removingNumbers("TAY22")): "Input contains a number";
        assert "TAY".equals(removeNumbers.removingNumbers("tay22")): "Input contains a number";
        assert "taylor".equals(removeNumbers.removingNumbers("TAYLOR")): "Input contains no number";
        assert " ".equals(removeNumbers.removingNumbers("2022")): "Input only contains numbers";
        assert "SPIDERMAN".equals(removeNumbers.removingNumbers("spiderman3")): "Input contains a number";
    }
}

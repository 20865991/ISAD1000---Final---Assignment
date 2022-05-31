import java.util.*;

public class StringValidation 
{
    public static boolean isNumeric (String input)
    { 
        boolean numeric = true; 

        try 
        { 
            double num = Double.parseDouble(input);
        }
        catch(NumberFormatException e)
        { 
            numeric = false;
        }

        if(numeric)
        { 
            System.out.print(input);
        }
        else 
        {
            System.out.print("This is not valid");
        }

        return numeric;

    }
    
}
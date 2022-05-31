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
            System.out.println(input);
        }
        else 
        {
            System.out.println("This is not valid");
        }

        return numeric;

    }
    
}
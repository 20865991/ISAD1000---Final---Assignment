import java.util.*;

public class StringValidation 
{
    public static boolean isNumeric (String input)
    { 
        String string = "woah";
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
            System.out.println(input + " this is valid");
        }
        else 
        {
            System.out.println(input + " This is not valid");
        }

        return numeric;

    }
    
}
import java.util.*;

public class numericalString 
{
    public static String identifyNumbers (String numID)
    { 
        char[] chars = numID.toCharArray();
        StringBuilder sb = new StringBuilder();
    
            for(char c : chars)
            { 
                if(Character.isDigit(c))
                { 
                    sb.append(c);
                }
            }
        
        String nString = sb.toString();
        System.out.println(sb);

        return nString;
    }

}

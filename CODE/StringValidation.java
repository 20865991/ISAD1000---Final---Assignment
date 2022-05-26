import java.util.*;

public class StringValidation 
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);

        String strNum; 

        System.out.print("Please enter a String\n");
        strNum = sc.nextLine();

        if (strNum == null)
        { 
            System.out.println("This not a numerical string");
        }
        else if (strNum != null)
        {
            System.out.println("this is a valid numerical string");
        }
//          
    }
}
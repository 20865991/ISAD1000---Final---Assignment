import java.util.*;

public class identifyNumbers 
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);

        String sample; 
        System.out.println("Please enter a username with numbers");
        sample = sc.nextLine();

        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : chars)
        { 
            if(Character.isDigit(c))
            { 
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
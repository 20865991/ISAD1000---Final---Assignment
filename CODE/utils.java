import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class utils 
{
    private static void writeOneRow(String pFilename, double result)
    { 
        FileOutputStream fileStrm = null;
        PrintWriter pw;
        try
        { 
            fileStrm = new FileOutputStream(pFilename);
            pw = new PrintWriter(fileStrm);
            pw.println(result);
            pw.close();  
        }
        catch(IOException e)
        { 
            System.out.println("Error in wroting to file: " + e.getMessage());
        }
    }

    public static void fileRead(String pFileName)
    { 
        FileInputStream fileStream = null; 
        InputStreamReader rdr; 
        BufferedReader bufRdr;
        int lineNum; 
        String line; 

        try
        { 
            fileStream = new FileInputStream(pFileName);
            rdr        = new InputStreamReader(fileStream);
            bufRdr     = new BufferedReader(rdr);
            lineNum    = 0; 
            line       = bufRdr.readLine();
            while(line != null)
            { 
                lineNum++;
                processLine(line);
                line = bufRdr.readLine();
            }
                fileStream.close();
        }
        catch(IOException errorDetails)
        { 
            if(fileStream != null)
            { 
                try 
                { 
                    fileStream.close();
                }
                catch(IOException ex2)
                { }
            }
            System.out.println("Error in fileProcessing: " + errorDetails.getMessage());
        }
    }
    private static void processLine(String csvRow)
    { 
        String[] splitLine; 
        splitLine = csvRow.split(",");
        int lineLength = splitLine.length; 

        for(int i = 0; i < lineLength; i++)
        { 
            System.out.print(splitLine[i] + " ");
        }
        System.out.println("");
    }

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

    public static String toUpper(String lower)
	{ 
		String upperCase;

		upperCase = lower.toUpperCase();
		System.out.println("The uppercase  conversion is:  " + upperCase);

		return upperCase;
	}

	public static String toLower(String upper)
	{ 
		String lowerCase;

		lowerCase = upper.toLowerCase();
		System.out.println("The uppercase  conversion is:  " + lowerCase);

		return lowerCase;
	}

    public static double meterConversion(double feet)
	{
		double result;

		result  = (feet / 3.281);

		System.out.println("The answer is: " +  result  + "m");

		return result; 
	}
	public static double feetConversion(double meters)
	{ 
		double result; 
		
		result  = (meters * 3.281);
	    
		System.out.println("The answer is: " + result + "ft");

		return result; 
	}
	public static double inchesConversion(double cm)
	{ 
		double result;

		result  = (cm / 2.54);

		System.out.println("The answer is: " +  result  + "in");

		return result; 
	}
	public static double cmConversion(double inches)
	{ 
		double result;
		
		result  = (inches  * 3.281);
	
		System.out.println("The answer is: " + result  + "cm");

		return result; 
	}

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
import java.util.*;
import java.io.*;

public class utils 
{
    //write submodule
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
    // read submodule
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
                System.out.println("This is a break");
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
}
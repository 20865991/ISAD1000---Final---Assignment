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
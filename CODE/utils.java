import java.util.*;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class utils 
{
    private static final DecimalFormat df = new DecimalFormat("0.000");
    //write submodule
    public static void fileWriter(double[] input)
    { 
        FileOutputStream fileStrm = null;
        PrintWriter pw;
        try
        { 
            fileStrm = new FileOutputStream("results.txt");
            pw = new PrintWriter(fileStrm);

            for(int i = 0; i < input.length; i++)
            {
                pw.println("answer is " + df.format(input[i]));
                 
            }

            pw.close(); 
        }
        catch(IOException e)
        { 
            System.out.println("Error in writing to file: " + e.getMessage());
        }
    }


    public static double meterConversion(double feet)
	{
		double result;

		result  = (feet / 3.281);

		System.out.println("The answer is: " +  df.format(result)  + "m");

		return result; 
	}
	public static double feetConversion(double meters)
	{ 
		double result; 
		
		result  = (meters * 3.281);
	    
		System.out.println("The answer is: " + df.format(result) + "ft");

		return result; 
	}
	public static double inchesConversion(double cm)
	{ 
		double result;

		result  = (cm / 2.54);

		System.out.println("The answer is: " +  df.format(result)  + "in");

		return result; 
	}
	public static double cmConversion(double inches)
	{ 
		double result;
		
		result  = (inches  * 3.281);
	
		System.out.println("The answer is: " + df.format(result)  + "cm");

		return result; 
	}
}
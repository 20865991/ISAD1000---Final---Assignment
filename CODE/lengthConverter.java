import java.util.*;
import java.io.*;

public class lengthConverter 
{
    public static double conversion1 (String pFilename)
    { 
        Scanner sc = new Scanner(System.in);
        double result, meters, feet, cm, inches;
        char choice;
		result = 0;

		utils.fileRead(pFilename);
                
        System.out.print("\nPlease enter m for meters conversion from feet OR \nEnter f for feet conversion from meters");
        choice = sc.next().charAt(0);

		if (choice == 'm'||choice == 'M')
		{
			System.out.print("Please enter length in Feet");
            feet = sc.nextDouble();
			result = utils.meterConversion(feet);
		}

		if  (choice == 'f' || choice == 'F')
		{
		    System.out.print("Please enter Length in meters");
            meters = sc.nextDouble();

			result = utils.feetConversion(meters);
		}
		return result; 
	} 
	public static void main(String[] args)
	{ 
		
		utils.fileRead("file01.txt");
	}

	public static double conversion2 (String pFilename)
    { 
        Scanner sc = new Scanner(System.in);
        double result, meters, feet, cm, inches;
        char choice;
		result = 0;

		System.out.println("\n PLease enter i for inches conversion from cm OR \nEnter c for centimeters conversion from inches");
		choice = sc.next().charAt(0);

		if (choice == 'i'||choice == 'I')
		{
            System.out.print("Please enter length in centimeters");
            cm = sc.nextDouble();
			
			result = utils.inchesConversion(cm);
		}

		if  (choice == 'c' || choice == 'C')
		{
		    System.out.print("Please enter Length in inches");
            inches = sc.nextDouble();
			
			result = utils.cmConversion(inches);
		} 
	return result; 
    }  
}
import java.util.*;

public class lengthConverter 
{
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
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        double meters, feet, cm, inches;
        char choice;
                
        System.out.print("\nPlease enter m for meters conversion \nEnter f for feet conversion \nEnter i for inches conversion \nEnterc for centimeters conversion");
        choice = sc.next().charAt(0);

		if (choice == 'm'||choice == 'M')
		{
			System.out.print("Please enter length in Feet");
            feet = sc.nextDouble();
			double convertMeters = lengthConverter.meterConversion(feet);
		}

		if  (choice == 'f' || choice == 'F')
		{
		    System.out.print("Please enter Length in meters");
            meters = sc.nextDouble();

			double convertFeet = lengthConverter.feetConversion(meters);
		}

		if (choice == 'i'||choice == 'I')
		{
            System.out.print("Please enter length in centimeters");
            cm = sc.nextDouble();
			
			double convertInches = lengthConverter.inchesConversion(cm);
		}

		if  (choice == 'c' || choice == 'C')
		{
		    System.out.print("Please enter Length in inches");
            inches = sc.nextDouble();
			
			double convertCm = lengthConverter.cmConversion(inches);
		}
		
	sc.close();  
    }  
}
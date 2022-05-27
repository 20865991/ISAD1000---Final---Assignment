import java.util.*;

public class lengthConverter 
{
    public static double conversions (String pFilename)
    { 
        Scanner sc = new Scanner(System.in);
        double result, meters, feet, cm, inches;
        char choice;
		result = 0;
                
        System.out.print("\nPlease enter m for meters conversion \nEnter f for feet conversion \nEnter i for inches conversion \nEnterc for centimeters conversion");
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
		
	sc.close();  
	return result; 
    }  
}
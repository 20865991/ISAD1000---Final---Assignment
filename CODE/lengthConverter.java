import java.util.*;

public class lengthConverter 
{

    public static double[] conversion1 (String pFilename)
    { 
        Scanner sc = new Scanner(System.in);
        double result, meters, feet, cm, inches;
        char choice;
		result = 0;
		double[] nArray;
	
		nArray = fileReader.fileRead("file.txt");
		double[] resultArray = new double[nArray.length]; 
                
        System.out.print("Please enter m for meters conversion from feet OR Enter f for feet conversion from meters");
        choice = sc.next().charAt(0);

		if (choice == 'm'||choice == 'M')
		{
			for(int i = 0; i < nArray.length; i++)
			{ 
				result = utils.meterConversion(nArray[i]);
				resultArray[i] = result;
			} 

			utils.fileWriter(resultArray);
		}

		if  (choice == 'f' || choice == 'F')
		{
			for(int i = 0; i < nArray.length; i++)
			{
				result = utils.feetConversion(nArray[i]);
				resultArray[i] = result;
			}
			
			utils.fileWriter(resultArray);
		}
		return resultArray; 
	} 

	public static double[] conversion2 (String pFilename)
    { 
        Scanner sc = new Scanner(System.in);
        double result, meters, feet, cm, inches;
        char choice;
		result = 0;
		double[] nArray;
	
		nArray = fileReader.fileRead("file.txt");
		double[] resultArray = new double[nArray.length]; 
                
        System.out.println("PLease enter i for inches conversion from cm OR Enter c for centimeters conversion from inches");
        choice = sc.next().charAt(0);

		if (choice == 'i'||choice == 'I')
		{
			for(int i = 0; i < nArray.length; i++)
			{ 
				result = utils.inchesConversion(nArray[i]);
				resultArray[i] = result;
			} 

			utils.fileWriter(resultArray);
		}

		if  (choice == 'c' || choice == 'C')
		{
			for(int i = 0; i < nArray.length; i++)
			{
				result = utils.cmConversion(nArray[i]);
				resultArray[i] = result;
			}
			
			utils.fileWriter(resultArray);
		}
		return resultArray; 
	} 
	public static void conversionMenu (String pFilename)
	{ 
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			do
			{ 
				try
				{ 
					System.out.println("Please select any option\n1: Conversion 1 (m to f and f to m) \n2: Conversion 2 (in to cm or cm to in)\n0: to exit the program"); 
					choice = sc.nextInt();
				}
				catch(InputMismatchException e)
				{
					System.out.println("Please enter a number"); 
					sc.nextLine(); 
					choice = sc.nextInt(); 
				}

	}while (choice < 0 || choice >= 4); 

		if(choice != 0)
		{
			if(choice == 1)
			{
				lengthConverter.conversion1("file.txt");
			} 
			if(choice == 2)
			{
				lengthConverter.conversion2("file.txt");
			} 
		} 
		 
}while (choice != 0); 
		 
	System.out.println("Thank You");
	}
}

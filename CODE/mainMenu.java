import java.util.*;
import java.io.*;

public class mainMenu 
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in); 
        int choice;
            do
            {
                do
                { 
                    try
                    { 
                        System.out.println("Please select any option\n1: identify numbers within a string\n2: Remove numbers from a string\n3: Convert String \n4: Validate a string\n5: length conversion\n0: To exit the program"); 
                        choice = sc.nextInt();
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Please enter a number"); 
                        sc.nextLine(); 
                        choice = sc.nextInt(); 
                    }

        }while (choice < 0 || choice >= 6); 

            if(choice != 0)
            {
                if(choice == 1)
                {
                    numericalString.identifyNumbers("batman3");
                } 
                if(choice == 2)
                {
                    removeNumbers.removingNumbers("TAY22");
                } 
                if(choice == 3)
                {
                    String str;
                    System.out.println("please enter a string in all lowercase or all uppercase");
                    str = sc.next(); 

                    StringConverter.convertString(str);
		        }
                if(choice == 4)
                { 
                    String str;
                    System.out.println("please enter a string");
                    str = sc.next(); 

                    StringValidation.isNumeric(str);
                }
                if(choice == 5)		
                {
                    lengthConverter.calculations("file.txt");
                }
            } 
             
    }while (choice != 0); 
             
    System.out.println("Thank You");
    }
}

import java.util.*;
import java.io.*;

public class readFile
{ 
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
}

import java.util.*;
import java.io.*;

public class writeToFile 
{    
    private static void writeOneRow(String pFilename, int pID, String pName)
    { 
        FileOutputStream fileStrm = null;
        PrintWriter pw;
        try
        { 
            fileStrm = new FileOutputStream(pFilename);
            pw = new PrintWriter(fileStrm);
            pw.println(pID + "," + pName);
            pw.close();  
        }
        catch(IOException e)
        { 
            System.out.println("Error in wroting to file: " + e.getMessage());
        }
    }
}

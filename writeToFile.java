import java.util.*;
import java.io.*;

public class writeToFile 
{    
    private static void writeOneRow(String pFilename, int pID, String pName, double pAssign, double pTest, double pExam, double pOverall)
    { 
        FileOutputStream fileStrm = null;
        PrintWriter pw;
        try
        { 
            fileStrm = new FileOutputStream(pFilename);
            pw = new PrintWriter(fileStrm);
            pw.println(pID + "," + pName + "," + pAssign + "," + pTest + "," + pExam + "," + pOverall);
            pw.close();  
        }
        catch(IOException e)
        { 
            System.out.println("Error in wroting to file: " + e.getMessage());
        }
    }
}

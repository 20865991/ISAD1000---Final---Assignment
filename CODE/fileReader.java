import java.util.*; 
import java.io.*; 
public class fileReader 
{
    public static void fileRead(String pFileName) 
    {
        FileInputStream fileStream = null;
        InputStreamReader rdr;
        BufferedReader bufRdr;

        int lineNum = 0; 
        String line;
   
        try 
        {
            fileStream = new FileInputStream(pFileName);
            rdr        = new InputStreamReader(fileStream);
            bufRdr     = new BufferedReader(rdr);
            lineNum    = 0;
            line       = bufRdr.readLine();
            line = bufRdr.readLine();

            while(line != null)
            {
                lineNum++;


                line = bufRdr.readLine();

            }
                fileStream.close();
        

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
}





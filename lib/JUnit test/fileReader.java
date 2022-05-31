import java.util.*; 
import java.io.*; 
public class fileReader 
{
    public static double[] fileRead(String pFileName) 
    {
        FileInputStream fileStream = null;
        InputStreamReader rdr;
        BufferedReader bufRdr;
        double[] splitLine = new double[10];
        int lineLength = splitLine.length;
        int count = 0; 
        String line;

   
        try 
        {
            fileStream = new FileInputStream(pFileName);
            rdr        = new InputStreamReader(fileStream);
            bufRdr     = new BufferedReader(rdr);
            count    = 0;

            line  = bufRdr.readLine();
            splitLine[0] = Double.parseDouble(line);

            while(line != null)
            {
                    count++;
                
                    line = bufRdr.readLine();
                    if(line != null)
                    {
                        System.out.println(line);
                    
                        splitLine[count] = Double.parseDouble(line);
                    }
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

        return splitLine;

    }
}





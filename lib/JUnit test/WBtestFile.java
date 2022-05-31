import java.util.*;
import java.io.*;

public class WBtestFile 
{
   public void testIsNumeric()
   { 
       String testInput = ("5991");

       ByteArrayOutputStream capOut = new ByteArrayOutputStream();
       System.setOut(new PrintStream(capOut));

       assert "true, this is valid".equals(StringValidation.isNumeric("5991"));
   }

   public void testConvertString()
   { 
       String testInput = "taylor"; 

       ByteArrayOutputStream capOut = new ByteArrayOutputStream();
       System.setOut(new PrintStream(capOut));

       assert "TAYLOR".equals(StringConverter.convertString("taylor"));
   }
}

import java.io.ByteArrayOutputStream;
import java.util.*;
import org.junit.*; 
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import java.io.*;

@RunWith(JUnit4.class)

public class testFile
{
   @Test 
	public void testConvertString()
	{ 
		assertEquals("input is lowercase", "TAYLOR", StringConverter.convertString("taylor"));
		assertEquals("input is uppercase", "taylor", StringConverter.convertString("TAYLOR"));
		assertEquals("input contains an uppercase character", "", StringConverter.convertString("Batman"));
		assertEquals("Input contains a lowercase character", "", StringConverter.convertString("BATMAn"));
		assertEquals("input contains an uppercase character", "JONATHAN MARC", StringConverter.convertString("jonathan marc"));
		assertEquals("Input contains a number", "5991", StringConverter.convertString("5991"));
	}

	@Test
	public void testIsNumeric()
	{ 

		assertTrue("numeric = true, input is valid", StringValidation.isNumeric("5991"));
		assertFalse("numeric = fasle, input is invalid", StringValidation.isNumeric("batman"));
		assertFalse("numeric = false, input is invalid", StringValidation.isNumeric("taylor22"));

	}

	@Test 
	public void testRemovingNumbers()
	{ 

		assertEquals("Input contains a number", "tay", removeNumbers.removingNumbers("TAY22"));
		assertEquals("Input contains a number", "TAY", removeNumbers.removingNumbers("tay22"));
		assertEquals("Input contains no number", "taylor", removeNumbers.removingNumbers("TAYLOR"));
		assertEquals("Input only contains numbers", "", removeNumbers.removingNumbers("2022"));
		assertEquals("Input contains a number", "SPIDERMAN", removeNumbers.removingNumbers("spiderman3"));

	}

	@Test
	public void testNumericalString()
	{ 

		assertEquals("Input contains a number", "22", numericalString.identifyNumbers("taylor22"));
		assertEquals("Input contains no numbers", "", numericalString.identifyNumbers("taylor"));
		assertEquals("Input contains a number", "2", numericalString.identifyNumbers("batman2"));
	}

	@Test 
	public void testConversion1()
	{ 
		assertEquals("file contains data in metres", "222.779", lengthConverter.conversion1("file.txt, 67.9"));
        assertEquals("file contains data in ft", "30.266", lengthConverter.conversion1("file.txt, 99.3"));
	}

	@Test 
	public void testConversion2()
	{ 
		assertEquals("file contains data in inches", "177.546", lengthConverter.conversion2("file.txt, 69.9"));
        assertEquals("file contains data in cm", "17.125", lengthConverter.conversion2("file.txt, 43.5"));
	}

    
	@Test
	public void WBtestIsNumeric()
    { 

       ByteArrayOutputStream capOut = new ByteArrayOutputStream();
       System.setOut(new PrintStream(capOut));

	   StringValidation.isNumeric("5991");

       assertEquals("Should be valid", "5991",capOut.toString());
    }

	
	@Test
    public void WBtestConvertString()
    { 
       ByteArrayOutputStream capOut = new ByteArrayOutputStream();
       System.setOut(new PrintStream(capOut));

	   StringConverter.convertString("taylor");

       assertEquals("Should convert to uppercase ", "The uppercase conversion is: TAYLOR", capOut.toString());
    }

	
}

import java.util.*;
public class testFile
{
    @Test 
	public void testConvertString()
	{ 
		assertEquals("input is lowercase", "TAYLOR", StringConverter.convertString("taylor"));
		assertEquals("input is uppercase", "taylor", StringConverter.convertString("TAYLOR"));
		assertEquals("input contains an uppercase character", "batman", StringConverter.convertString("Batman"));
		assertEquals("Input contains a lowercase character", "batman", StringConverter.convertString("BATMAn"));
		assertEquals("input contains an uppercase character", "JONATHAN MARC", StringConverter.convertString("Jonathan Marc"));
		assertEquals("Input contains a lowercase character", "JONATHAN MARC", StringConverter.convertString("Jonathan Marc"));
		assertEquals("Input contains a number", StringConverter.convertString("20865991"));
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
		assertEquals("Input only contains numbers", " ", removeNumbers.removingNumbers("2022"));
		assertEquals("Input contains a number", "SPIDERMAN", removeNumbers.removingNumbers("spiderman3"));

	}

	@Test
	public void testNumericalString()
	{ 

		assertEquals("Input contains a number", "22", numericalString.identifyNumbers("taylor22"));
		assertEquals("Input contains no numbers", " ", numericalString.identifyNumbers("taylor"));
		assertEquals("Input contains a number", "2", numericalString.identifyNumbers("batman2"));
	}
        
}

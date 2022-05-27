import java.util.*;
public class StringConverterTest 
{
    public static void main(String[] args)
    { 
	
		assert "TAYLOR".equals(StringConverter.convertString("taylor")): "input is lowercase";
		assert "taylor".equals(StringConverter.convertString("TAYLOR")): "input is uppercase";
		assert "batman".equals(StringConverter.convertString("Batman")): "Input contains an uppercase character";
		assert "batman".equals(StringConverter.convertString("BATMAn")): "Input contains a lowercase character";
		assert "JONATHAN MARC".equals(StringConverter.convertString("Jonathan Marc")): "Input contains an uppercase character";
		assert "JONATHAN MARC".equals(StringConverter.convertString("Jonathan Marc")): "Input contains a lowercase character";
		assert " ".equals(StringConverter.convertString("20865991")): "Input contains a number";

	}
}

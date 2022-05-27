import java.util.*;
public class numericalStringTest 
{
     public static void main(String[] args)
    { 
        assert "22".equals(numericalString.identifyNumbers("taylor22")): "Input contains a number";
        assert " ".equals(numericalString.identifyNumbers("taylor")): "Input contains no numbers";
        assert "2".equals(numericalString.identifyNumbers("batman2")): "Input contains a number";
    }
}

import java.util.*;
public class removeNumbersTest 
{
     public static void main (String[] args)
    { 
        assert "tay".equals(removeNumbers.removingNumbers("TAY22")): "str contains a number";
        assert "TAY".equals(removeNumbers.removingNumbers("tay22")): "str contains a number";
        assert "taylor".equals(removeNumbers.removingNumbers("TAYLOR")): "str contains no number";
        assert " ".equals(removeNumbers.removingNumbers("2022")): "str only contains numbers";
        assert "SPIDERMAN".equals(removeNumbers.removingNumbers("spiderman3")): "str contains a number";
    }
}

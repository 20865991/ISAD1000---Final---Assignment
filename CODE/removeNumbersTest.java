import java.util.*;
public class removeNumbersTest 
{
     public static void main (String[] args)
    { 
        assert "tay".equals(removeNumbers.removingNumbers("TAY22")): "Input contains a number";
        assert "TAY".equals(removeNumbers.removingNumbers("tay22")): "Input contains a number";
        assert "taylor".equals(removeNumbers.removingNumbers("TAYLOR")): "Input contains no number";
        assert " ".equals(removeNumbers.removingNumbers("2022")): "Input only contains numbers";
        assert "SPIDERMAN".equals(removeNumbers.removingNumbers("spiderman3")): "Input contains a number";
    }
}

import java.util.*;
public class StringValidationTest 
{
    public static void main(String[] args)
    { 
        
        boolean numeric = true;
        assert numeric == StringValidation.isNumeric("5991"): "numeric = true, input is valid";
        assert !numeric == StringValidation.isNumeric("batman"): "numeric = fasle, input is invalid";
        assert !numeric == StringValidation.isNumeric("taylor22"): "numeric = false, input is invalid";

    }  
}

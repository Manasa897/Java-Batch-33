package exceptions;

import java.io.Serializable;

public class ConvertStringToInt {
    public static int convertToInt(String str) {
        try
        {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception occurred for the string "+str);
            return 0;
        }
    }
}
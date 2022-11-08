import javax.lang.model.util.ElementScanner14;
import java.lang.Exception;

class NotValidAgeException extends Exception
{   
    
}

public class tEPrac {
    
    public static Boolean containsDigit(String userInput)
    {
        for (int i = 0, n = userInput.length(); i < n; ++i)
        {
            if (userInput.charAt(i) >= 48 && userInput.charAt(i) <= 57)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try{
            if (containsDigit(args[0]))
            { 
                System.out.println("Digit exists");
            }else{ 
                System.out.println("Digit doesn't exist");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            e.getStackTrace();
            System.out.println("Please input a string!");
        }catch(RuntimeException e)
        {
            e.getStackTrace();
            System.out.println("Runtime error");
        }catch(Exception e)
        {
            e.getStackTrace();
            System.out.println("Exception!");
        }finally{
            System.out.println("Final block");
        }

        System.out.println("End of main!");
    }
}

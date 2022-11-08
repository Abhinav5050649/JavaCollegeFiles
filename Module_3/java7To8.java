import java.util.InputMismatchException;
import java.util.zip.DataFormatException;

public class java7To8 {
    public static void main(String[] args)
    {
        System.out.println("Start of main!");
        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = num1 / num2;
            System.out.println(num3);
        }catch(ArithmeticException e){
            System.out.println("Denominator is 0. Zero can't divide any number");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please input CLI argument!");
        }catch(NumberFormatException e)
        {
            System.out.println("Invalid data type of CLI argument!");
        }catch(RuntimeException e)
        {
            System.out.println("Runtime Error!");
            System.out.println(e.getMessage());   
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Final block!");
        }

        System.out.println("End of main!");
    }
}

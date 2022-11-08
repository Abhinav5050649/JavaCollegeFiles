import java.util.Scanner;
class InvalidBoxException extends Exception{
    InvalidBoxException()
    {}
    public InvalidBoxException(String str)
    {
        super(str);
    }
}

public class _11InvalidTryBox extends InvalidBoxException{
    public static void validate(int l, int b, int h)  throws InvalidBoxException{
        if (l < 0 || b < 0 || h < 0)
        {
            throw new InvalidBoxException("Invalid Box");
        }
        else{
            System.out.println("Valid Box");
        }
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        try
        {
            validate(length, breadth, height);
        }
        catch (InvalidBoxException e){
            System.out.println("Exception caught");
            System.out.println("Exception occured: " + e);
        }
        sc.close();
    }
}
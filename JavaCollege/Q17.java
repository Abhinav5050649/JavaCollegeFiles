import java.util.Scanner;

public class Q17{
    public static void main(String args[]) {

        double x = 28;    
        double y = 4;
        double z= -4.56;    
          
        
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        
        System.out.println("Square root of y is: " + Math.sqrt(y)); 
        
        System.out.println("Cube root of x is :" + Math.cbrt(x));  
        
        System.out.println("Power of x and y is: " + Math.pow(x, y));      

        System.out.println("Round off to nearest integer of z" +Math.abs(z));
        
        System.out.println("Logarithm of x is: " + Math.log(x));   
                
        System.out.println("log10 of x is: " + Math.log10(x));     
  
        System.out.println("exp of a is: " +Math.exp(x)); 

        System.out.println("Sin value of given y is " + Math.sin(y));

        System.out.println("Sin value of given y is " + Math.cos(y));

        System.out.println("Sin value of given y is " + Math.sinh(y));

        System.out.println("Sin value of given y is " + Math.cosh(y));
        
    }

}
/*public class Q17 {

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
            
        int performOp = -1;
        
        do
        {
            int op = -1;
            System.out.println("Enter\n1) Sum\n2) Product\n3) Divide\n4) Subtraction\n5) pow\n6) abs\n7) max\n8) min\n9) exp\n10) log\n11) sqrt\n12) cbrt\n13) sin\n0) Exit\n\nEnter option: ");
            op= sc.nextInt();
            switch(op)
            {
                case 0:
                    break;
                case 1:
                    sum();
                    break;
                case 2:
                    product();
                    break;
                case 3:
                    divide();
                    break;
                case 4:
                    sub();
                    break;
                case 5:
                    Pow();
                    break;
                case 6:
                    aBS();
                    break;
                case 7:
                    mAX();
                    break;
                case 8:
                    mIN();
                    break;
                case 9:
                    Exp();
                    break;
                case 10:
                    LOG();
                    break;
                case 11:
                    SQRT();
                    break;
                case 12:
                    CBRT();
                    break;
                case 13:
                    SINE();
                    break;

            }
            performOp = op;
        }
        while (performOp != 0);

        sc.close();
    }

    public static void sum()
    {
        Scanner sc =  new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("Sum = " + (num1 + num2));
        sc.close();
        return;
    }

    public static void product()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("Product of given numbers = " + (num1 * num2));
        sc.close();
    }

    public static void divide()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        if (num2 == 0)
        {
            System.out.println("Cannot divide by zero");
        }
        else
        {
            System.out.println("Quotient = " + (num1 / num2) + "\nRemainder = " + (num1 % num2) + "\n");
        }
        sc.close();
    }

    public static void sub()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("Difference = " + (num1 - num2));
        sc.close();
    }

    public static void Pow()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Enter base number: ");
        num1 = sc.nextInt();

        System.out.println("Enter exponent: ");
        num2 = sc.nextInt();

        System.out.println("Answer = " + Math.pow(num1, num2));
        sc.close();
    }

    public static void aBS()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Enter number: ");
        sc.nextInt();

        System.out.println("Absolute Value: " + Math.abs(num1));
        sc.close();
    }

    public static void mAX()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Enter base number: ");
        num1 = sc.nextInt();

        System.out.println("Enter exponent: ");
        num2 = sc.nextInt();

        System.out.println("Maximum number: " + Math.max(num1, num2));
        sc.close();
    }

    public static void mIN()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Enter base number: ");
        num1 = sc.nextInt();

        System.out.println("Enter exponent: ");
        num2 = sc.nextInt();

        System.out.println("Minimum number: " + Math.min(num1, num2));
        sc.close();
    }

    public static void Exp()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Enter number: ");
        num1 = sc.nextInt();

        System.out.println("Required answer: " + Math.exp(num1));
        sc.close();
    }

    public static void LOG()
    {
      
        Scanner sc = new Scanner(System.in);
        int num2 = 0;

        System.out.println("Enter number: ");
        num2 = sc.nextInt();

        System.out.println("Maximum number: " + Math.log(num2));
        sc.close();
    }

    public static void SQRT()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Enter number: ");
        num1 = sc.nextInt();

        System.out.println("Sqrt = " + Math.sqrt(num1));
        sc.close();
    }

    public static void CBRT()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Enter number: ");
        num1 = sc.nextInt();

        System.out.println("Cbrt = " + Math.cbrt(num1));
        sc.close();
    }

    public static void SINE()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Enter number: ");
        num1 = sc.nextInt();

        System.out.println("SINE = " + Math.sin(num1));
        sc.close();
    }
}
*/
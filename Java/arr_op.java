import java.util.Scanner;

public class arr_op {
    //sum, product, average, minimum, maximum
    static int sumOfArray(int[] arr, int size_of_array)
    {
        int sum = 0;
        for (int i = 0; i < size_of_array; ++i)
        {
            sum += arr[i];
        }
        return sum;
    }

    static int minimum(int[] arr, int size_of_array)
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < size_of_array; ++i)
        {
            if (arr[i] < mini) 
            {
                mini = arr[i];
            }
        }
        return mini;
    }

    static int maximum(int[] arr, int size_of_array)
    {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < size_of_array; ++i)
        {
            if (arr[i] > maxi) 
            {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int averageOfArray(int[] arr, int size_of_array)
    {
        int sum = 0;
        for (int i = 0; i < size_of_array; ++i)
        {
            sum += arr[i];
        }
        return (sum/size_of_array);
    }

    static int productOfArray(int[] arr, int size_of_array)
    {
        int product_of_array = 1;
        for (int i = 0; i < size_of_array; ++i)
        {
            product_of_array *= arr[i];
        }
        return product_of_array;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size_of_array = sc.nextInt();

        int[] arr = new int[size_of_array];
        for (int i = 0; i < size_of_array; ++i)
        {
            System.out.print("Enter element " + (i + 1) + ":\n");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n\n");
        int op = -1;
        do
        {
            System.out.println("Enter\n1:For Sum:\n2:For Product\n3:For Average\n4:For Maximum\n5:For Minimum\n0: Exit\n\n");
            op = sc.nextInt();

            switch(op)
            {
                case 0:
                    break;
                case 1:
                    int sum = sumOfArray(arr, size_of_array);
                    System.out.println("Sum == " + sum);
                    break;
                case 2:
                    int prod = productOfArray(arr, size_of_array);
                    System.out.println("Product == " + prod);
                    break;
                
                case 3:
                    int average = averageOfArray(arr, size_of_array);
                    System.out.println("Average == " + average);
                    break;

                case 4:
                    int maximumx = maximum(arr, size_of_array);
                    System.out.println("Maximum == " + maximumx);
                    break;
                
                case 5: 
                    int minimumx = minimum(arr, size_of_array);
                    System.out.println("Minimum == " + minimumx);
                    break;

                default:
                    System.out.println("Enter proper option number!!!");
                    break;
            }
            System.out.println("\n\n");
        }
        while (op != 0);


    }
}

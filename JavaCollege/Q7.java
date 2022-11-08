import java.util.Scanner;
public class Q7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        int[] arrs = new int[size];
        for (int i = 0; i < size; ++i)
        {
            System.out.println("Enter a number: ");
            arrs[i] = sc.nextInt();
        }

        int op = -1;
        do
        {
            System.out.println("Enter\n1:Sum\n2:Product\n3:To check divisibility by 15\n4:To find maximum number\n5:To find minimum number\n6:To sort array\n0:To exit");
            op = sc.nextInt();

            switch (op)
            {
                case 0:
                    break;

                case 1:
                    sum(arrs, arrs.length);
                    break;
                
                case 2:
                    product(arrs, arrs.length);
                    break;
                
                case 3:
                    divisbility_by_fifteen(arrs, arrs.length);
                    break;
                
                case 4:
                    Maximum_Number(arrs, arrs.length);
                    break;
                
                case 5:
                    Minimum_Number(arrs, arrs.length);
                    break;
                
                case 6:
                    sort_array(arrs, arrs.length);
                    break;

                default: 
                    System.out.println("Enter proper option number!");
            }

            System.out.println();
            System.out.println();
            System.out.println();
        }
        while (op != 0);
        
        sc.close();
    }

    static void sum(int arr[], int arr_length)
    {
        int sum = 0;
        for (int i = 0; i < arr_length; ++i)
        {
            sum += arr[i];
        }

        System.out.println("Sum is " + sum);
    }

    static void product(int[] arr, int arr_length)
    {
        int product = 1;
        for (int i = 0; i < arr_length; ++i)
        {
            product *= arr[i];
        }

        System.out.println("Product is " + product);
    }

    static void divisbility_by_fifteen(int arr[], int arr_length)
    {
        System.out.println("Numbers in array divisble by 15: ");
        for (int i = 0; i < arr_length; ++i)
        {
            if (arr[i] % 15 == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void Maximum_Number(int[] arr, int arr_length)
    {
        int max_number = Integer.MIN_VALUE;
        for (int i = 0; i < arr_length; ++i)
        {
            if (arr[i] > max_number)
                max_number = arr[i];
        }
        System.out.println("Maximum Number is " + max_number);
    }

    static void Minimum_Number(int[] arr, int arr_length)
    {
        int min_number = Integer.MAX_VALUE;
        for (int i = 0; i < arr_length; ++i)
        {
            if (arr[i] < min_number)   
                min_number = arr[i];
        }

        System.out.println("Minimum element in array is " + min_number);
    }

    static void sort_array(int[] arr, int arr_length)
    {
        for (int i = 0; i < arr_length; ++i)
        {
            int swap = 0;
            for (int j = 0; j < arr_length - i - 1; ++j)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0)  
                break;
        }

        System.out.println("Sorted elements: ");    
        for (int i = 0; i < arr_length; ++i)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

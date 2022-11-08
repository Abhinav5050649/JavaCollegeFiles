public class _10nestedtry {
    public static void main(String[] args) {
        try {
            int a[] = { 1, 2, 3, 4, 5 };

            System.out.println(a[10]);
            try {
                int x = 5 / 0;
            }
            catch (ArithmeticException e2) {
                System.out.println("division by zero is not possible in nested try");
            }
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
            System.out.println("Element at such index does not exists main try block");
        }
    }
}

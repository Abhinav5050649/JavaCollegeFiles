import java.util.Arrays;
public class Q16 {
    public static void main(String[] args)
    {
        int[] marks = {20, 23, 10, 90, 34, 19};
        Arrays.sort(marks);
        System.out.println("Sorted result: " + Arrays.toString(marks));

        int[] newMarks = {90, 10, 20, 34, 23, 17};
        Arrays.sort(newMarks, 0, 4);
        System.out.println("New Variation " + Arrays.toString(newMarks));

        System.out.println(Arrays.equals(marks, newMarks));

        double[] arr1 = {2.5, 2788.0, 90.78, 78.5, 1.2};
        double[] arr2 = {2.577, 2788.1, 901.78, 783.5, 15.2};

        int[] newNewMarks = Arrays.copyOfRange(newMarks, 0, 4);
        System.out.println(Arrays.toString(newNewMarks));

        System.out.println(Arrays.binarySearch(marks, 101));

        System.out.println(Arrays.binarySearch(marks, 0, 5, 10));

        System.out.println(Arrays.binarySearch(arr1, 2.57));
        double[] arr3 = Arrays.copyOfRange(arr2, 0, 3);
        System.out.println(Arrays.toString(arr3));

        int[] newest = new int[5];
        Arrays.fill(newest, 1);
        System.out.println(Arrays.toString(newest));

        int[] newArr = new int[7];
        Arrays.fill(newArr, 0, 3, 10);
        System.out.println(Arrays.toString(newArr));

        int[] copyOfNewArr = new int[8];
        copyOfNewArr = Arrays.copyOf(marks, 8);
        System.out.println(Arrays.toString(copyOfNewArr));
    }
}

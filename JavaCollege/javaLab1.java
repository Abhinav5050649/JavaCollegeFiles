public class javaLab1 {
    public static void main(String[] args)
    {
        int[] marks = {1, 4, 2, 8, 5};
        varArgTest vat = new varArgTest();
        vat.maximum("Maths", "1", marks);
        
    }
}

class varArgTest{
    public
    
    varArgTest()
    {
        System.out.println("Object Created");
    }

    static void maximum(){}

    static void maximum(String subName, String divName, int[] marks)
    {
        java.util.Arrays.sort(marks);
        System.out.println("Student has secured maximum marks in " + subName + " of division " + divName + ". Maximum marks " + marks[marks.length - 1]);
    }
}

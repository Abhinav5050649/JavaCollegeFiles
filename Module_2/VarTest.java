class VarTest {

    public static double average(double first , double second , double... remaining){
        double total = first + second;
        for(double value: remaining) total+=value;

        return total /(remaining.length +2);
    }

    public static int maximum(String subname , String division , int... marks){
        int max=marks[0];
        for(int value: marks){
            if(value >max ){
                max=value;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        System.out.printf("Average = %.3f%n", average(12.3, 13.7, 15,14,16,17));

        System.out.println("Average = " +average(12.3, 13.7, 15,14,16,17));
        System.out.println(" Maximum marks of "+ maximum("Murli", "Patel",11,12,13,14));
    }

}
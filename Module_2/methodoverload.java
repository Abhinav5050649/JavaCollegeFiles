public class methodoverload {
    
    public static long area(int a , long b){
        return a+b;
    }

    // errror 
    // public static long area(long a , int b ){
    //     return a+b;
    // }

    public static void main(String args[]){

        System.out.println(area(2, 6));
    }
}

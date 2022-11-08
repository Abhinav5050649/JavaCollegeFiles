
public class stringmodule {

    public static void main(String args[]){

        String s=" JAava kese hoo aap      ";

        System.out.println(s.length());

        s.toLowerCase();
        s.toUpperCase();
        s.charAt(0);
        int A=12;
        String ss = String.valueOf(A);
        System.out.println(ss);

        s.substring(3);
        s.substring(4 , 9);
        s.trim();
        String c = s.concat("murli");
        System.out.println(c);
        String mm="murli";
        s.concat(mm);



    }
}

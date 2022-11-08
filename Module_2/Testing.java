
interface FirstTesting{
    public abstract void firsMethod();
}


class InterfaceTesting1{
    int number;

    public InterfaceTesting1(){
        number = 25;
}
    public InterfaceTesting1(int n){number=n;}
    
    public int getNumber(){return number;}
}

class InterfaceTesting2 extends InterfaceTesting1 implements FirstTesting{

public InterfaceTesting2(int n){super(n);}

public void firsMethod() {
    System.out.println("First method implemented");
    
}

}

public class Testing{

public static void main (String[] args){

    InterfaceTesting1 t1 = new InterfaceTesting1(25);
    InterfaceTesting2 t2 = new InterfaceTesting2(35);
    
    System.out.println("Number : " +t1.getNumber() + "and" + t2.getNumber());
        
            t2.firsMethod();


}

}